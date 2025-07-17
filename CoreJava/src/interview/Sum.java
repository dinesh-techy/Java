package interview;

public class Sum {


    public static boolean validStringCheck(String s , String t){
        int pointer1 = 0;
        int pointer2 = 0;

        while(pointer1<s.length() && pointer2<t.length()){
            char character1 = s.charAt(pointer1);
            char character2 = t.charAt(pointer2);
            System.out.println(character1 +"..."+character2);
            if(character1==character2){
                pointer1++;
                pointer2++;
            }
            else{
                if(Character.isDigit(character2)){
//                    pointer1+=Character.;
                    pointer2++;
                    System.out.println(pointer1+"..."+pointer2);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "GEEKSFORGEEKS";
//        String t = "G7G3S";
        System.out.println(validStringCheck("DFS","D1D"));
//        System.out.println(validStringCheck("GEEKSFORGEEKS","G7G3S"));

    }
}

//Input: nums = [1,2,3]Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]