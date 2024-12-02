/*
 * ArrayExamples
 * Declare an array of Size 10 
 * Populate the array with scores
 * Get the size of the array (length property)
 * Modify a score in the list
 * Output the first score
 * Output the entire list on separate lines
 *
 */
public class ArrayExamples {

    public static void main(String[] args) {
        //Declaring an integer array of size 10
        int[] scores = new int[10];

        //populate the list
        // 79, 87, 94, 82, 67, 98, 87, 81, 74, 91
        scores[0] = 79;
        scores[1] = 87;
        scores[2] = 94;
        scores[3] = 82;  //82->50
        scores[4] = 67;
        scores[5] = 98;
        scores[6] = 87;
        scores[7] = 81;
        scores[8] = 74;
        scores[9] = 91;

        //Get the size of the array
        int length = scores.length;
        System.out.println("Length: "+length);

        //Modify the fourth score 
        scores[3] = 50;

      //Output the first score
        int first = 0;
        //output scores[0]
        System.out.println("First score: "+ scores[first]); 

        //Out the last score
        int last = scores.length - 1 ;
        //output scores[scores.length - 1]
       // System.out.println("Last score: "+ scores[last]);
        System.out.println("Last score: "+ 
                scores[scores.length-1]);

        System.out.print("\n");

        //Output the contents of the array
        //on a separate line
        for(int i=0; i < scores.length; i++)
        {
            System.out.println(scores[i]);
        }


       //enhanced for loop
        //for each loop
        for (int score : scores)
        {
            System.out.print(score +" ");
        }


        System.out.println("\n");
        
        //Total the first three scores
        //in the array
        int total = scores[0]+scores[1]+scores[2];
        System.out.println("Sum of 3 scores: "+total);
        
        int sumAllScores = 0;
        
        //Sum of all scores in the array
        for(int i=0; i<scores.length; i++)
        {
            sumAllScores += scores[i];
        }
        
        float average = (float) sumAllScores / scores.length;
        
        System.out.println("Total: "+sumAllScores);
        System.out.println("Average: "+average);

      

    } //end main 
} //end class
