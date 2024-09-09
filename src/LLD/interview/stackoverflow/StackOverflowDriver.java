package src.LLD.interview.stackoverflow;

import src.LLD.interview.stackoverflow.post.Answer;
import src.LLD.interview.stackoverflow.post.Comment;
import src.LLD.interview.stackoverflow.post.Post;
import src.LLD.interview.stackoverflow.post.Question;
import src.LLD.interview.stackoverflow.reputation.AcceptedAnsReputationStrategy;
import src.LLD.interview.stackoverflow.reputation.UpvotesReputationStrategy;
import src.LLD.interview.stackoverflow.tag.Tag;
import src.LLD.interview.stackoverflow.user.User;

import java.util.ArrayList;
import java.util.List;

public class StackOverflowDriver {
    public static void main(String[] args){
        StackOverflow stackOverflow = StackOverflow.getInstance(new AcceptedAnsReputationStrategy());
        User muskan = new User("u1", "muskanbagrecha");
        User john = new User("u2", "johndoe");
        User adi = new User("u3", "adi");
        List<Tag> q1tags = new ArrayList<>();
        q1tags.add(new Tag("JAVA"));
        q1tags.add(new Tag("CONCURRENCY"));
        Question q1 = stackOverflow.createQuestion("q1",  muskan, "How do you handle concurrency in this scenario?", "I am learning multithreading but not able to understand how to tackle this. Any suggestions?", q1tags);
        Answer a1 = stackOverflow.addAnswer("q1", new Answer("a1", "Use synchronized keyword", adi));
        Answer a2 = stackOverflow.addAnswer("q1", new Answer("a2", "Umm that does not look right", john));
        stackOverflow.acceptAnswer("q1", "a1");
        stackOverflow.upvote(a1, muskan);
        List<Question> questions = stackOverflow.search("JAVA");
        for(Question question : questions){
            System.out.println(question.getTitle() + "\n" + question.getContent());
        }
        stackOverflow.addComment(a2, new Comment("c1", "What do you mean?", muskan));
    }
}
