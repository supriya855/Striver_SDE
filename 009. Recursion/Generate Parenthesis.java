class Solution {
    public List<String> generateParenthesis(int n) {
    // This based on backtracking 
    List<String> res= new ArrayList<>();
    permutation(res,"",0,0,n);
    return res;
    }
    public void permutation(List<String> res,String str,int openParen, int closeParen,int n){
        if(str.length()==n*2){
            res.add(str);
            return;
        }
        if(openParen<n){ 
            permutation(res,str+'(',openParen+1,closeParen,n);
        }
        if(closeParen<openParen){
            permutation(res,str+')',openParen,closeParen+1,n);
        }
    }
}
/*
((()))
openParen =3-> (((
3<3 condition fail
closeParen = 3 ->
closeParen : ((()))
base condition satisfies it goes on for all calls 
RECURSION TREE
*/
