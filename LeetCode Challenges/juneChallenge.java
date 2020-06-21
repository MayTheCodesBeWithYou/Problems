class juneChallenge {
public:
    string getPermutation(int n, int k) {
        
        string str;
        
        for(int i=0 ; i<n ; i++ ){
            str+=i+1+'0';
        }
        
        for(int i=0;i<k-1;i++){
            next_permutation(str.begin(),str.end());
        }
        
        return str;
    }
};