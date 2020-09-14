class TopVotedCandidate {

public:

   unordered_map<int, int> umap; //To keep account of leads at each timestamp.

   vector<int> times;

   TopVotedCandidate(vector<int>& persons, vector<int>& times) {

       int n = persons.size(); int lead = -1;

       this->times = times;

       unordered_map<int, int> count; //To keep a count of votes

       for(int i=0;i<n;i++)

       {

           count[persons[i]]++;

           if(count[persons[i]] >= count[lead])

               lead = persons[i];

           umap[times[i]] = lead;

       }

   }

   

   int q(int t) {

       return umap[*--upper_bound(times.begin(), times.end(), t)];

   }

};

/**

* Your TopVotedCandidate object will be instantiated and called as such:

* TopVotedCandidate* obj = new TopVotedCandidate(persons, times);

* int param_1 = obj->q(t);

*/
