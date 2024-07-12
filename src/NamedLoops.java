package src;

public class NamedLoops {
    public void testNamedLoops(){
        a:
            for(int i = 0; i<5; i++){
              b:
                for(int j = 0; j<5; j++){
                    if(i==2 && j==2){
                        break a; //this will terminate the external loop a
                    }
                    System.out.println(i + " " + j);
                }
            }
    }
}
