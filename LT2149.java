import java.util.*;

public class LT2149{ 
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,-4,-5));
        ArrayList<Integer> ans = RearrangebySign(A);
        for (int i=0; i < ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
        int n=A.size();
        //Define the array from storing the ans seperately
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,0));
        //positive starts from 0 and negative starts from 1
        int posIndex = 0, negIndex = 1;
        for(int i=0;i<n;i++){
            //Fill the negative elements in odd indices and increase by 2.
        if (A.get(i) < 0){
            ans.set(negIndex, A.get(i));
            negIndex +=2;
        }
        //Fill the positive elements in even indices and increase by 2
        else {
            ans.set(posIndex, A.get(i));
            posIndex +=2;
        }
    }
    return ans;
}
}
