// public class array {
//     public static void main(String[] args){
//         String[] cities = {"jammu", "hyderabad", "bareilly"};

//         for(int i=0; i<cities.length; i++){
//             System.out.println(cities[i]);
//         }
//     }
// }
public class array {
    public static void main(String[] args){
        int[][] cities = {{1,2,3},{4,5,6}};

        for(int i=0; i<cities.length; i++){
            for(int j=0; j<cities[i].length; j++){
                System.out.print(cities[i][j] + "\t");
            }
            System.out.println();
        }
    }
}