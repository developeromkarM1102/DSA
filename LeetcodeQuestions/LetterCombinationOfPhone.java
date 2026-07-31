package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhone{

    static void solve(String digits, String mapping [],List<String> result,int index,StringBuilder output){

        //base case
        if(index >= digits.length() ){
            result.add(output.toString());
            return;
        }

        //find current value & their mapped String
        int value = digits.charAt(index)-'0';
        String mappedString = mapping[value];

        for(int i=0;i<mappedString.length();i++){
            output.append(mappedString.charAt(i));
            //recursion call
            solve(digits, mapping, result, index+1, output );
            //backtracking
            output.deleteCharAt(output.length()-1);
        }
         
    }
    public List<String> letterCombinations(String digits) {
        
        String mapping [] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        int index = 0;
        StringBuilder output = new StringBuilder();
        solve(digits, mapping, result, index, output);
        return result;
    }
}