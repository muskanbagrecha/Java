package src.LLD.interview.stackoverflow;

import src.LLD.interview.stackoverflow.post.Answer;
import src.LLD.interview.stackoverflow.post.Comment;
import src.LLD.interview.stackoverflow.post.Post;
import src.LLD.interview.stackoverflow.post.Question;
import src.LLD.interview.stackoverflow.reputation.ReputationStrategy;
import src.LLD.interview.stackoverflow.reputation.UpvotesReputationStrategy;
import src.LLD.interview.stackoverflow.tag.Tag;
import src.LLD.interview.stackoverflow.user.User;
import src.LLD.interview.stackoverflow.vote.Downvote;
import src.LLD.interview.stackoverflow.vote.Upvote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StackOverflow {
    private static StackOverflow stackOverflow;
    private HashMap<String, Question> questions;
    private List<Tag> tags;
    private List<User> users;
    private ReputationStrategy reputationStrategy;

    private StackOverflow() {
        stackOverflow = new StackOverflow(new UpvotesReputationStrategy());
        questions = new HashMap<>();
        tags = new ArrayList<>();
        users = new ArrayList<>();
    }

    private StackOverflow(ReputationStrategy reputationStrategy) {
        this.reputationStrategy = reputationStrategy;
        questions = new HashMap<>();
        tags = new ArrayList<>();
        users = new ArrayList<>();
    }

    public static StackOverflow getInstance(ReputationStrategy reputationStrategy){
        if(stackOverflow==null){
            synchronized (StackOverflow.class){
                stackOverflow = new StackOverflow(reputationStrategy);
            }
        }
        return stackOverflow;
    }

    public Question createQuestion(String id, User author, String title, String content, List<Tag> tags){
        Question question = new Question(id, title, content, author, tags);
        questions.put(id, question);
        return question;
    }

    public boolean deleteQuestion(String questionId){
        questions.remove(questionId);
        return true;
    }

    public Answer addAnswer(String questionId, Answer answer){
        if(!questions.containsKey(questionId)){
            throw new IllegalArgumentException("Question key invalid");
        }
        questions.get(questionId).addAnswer(answer);
        return answer;
    }

    public boolean addComment(Post post, Comment comment){
        post.addComment(comment);
        return true;
    }

    public boolean removeComment(Post post, String commentId){
        post.removeComment(commentId);
        return true;
    }

    public boolean upvote(Post post, User user){
        if(hasUserVoted(post, user)){
            throw new IllegalArgumentException("User has already voted on this post.");
        }
        post.addUpvote(new Upvote(user));
        reputationStrategy.addReputationForUpvotes(post);
        return true;
    }

    public boolean downvote(Post post, User user){
        if(hasUserVoted(post, user)){
            throw new IllegalArgumentException("User has already voted on this post.");
        }
        return true;
    }

    public boolean hasUserVoted(Post post, User user){
        return post.getUpvotes().containsKey(user.getUserId()) || post.getDownvotes().containsKey(user.getUserId());
    }

    public List<Question> search(String query){
        List<Question> filteredQuestions = questions.values()
                .stream()
                .filter(question -> question.getTitle().contains(query) || question.getContent().contains(query) || question.hasTag(query))
                .toList();
        return filteredQuestions;
    }

    public void acceptAnswer(String questionId, String answerId){
        Question question = questions.get(questionId);
        if(!question.getAnswers().containsKey(answerId)){
            throw new IllegalArgumentException("Answer does not belong to this question.");
        }
        Answer answer = question.getAnswers().get(answerId);
        answer.setAccepted(true);
        reputationStrategy.addReputationForAcceptedAnswer(answer);
    }

}
