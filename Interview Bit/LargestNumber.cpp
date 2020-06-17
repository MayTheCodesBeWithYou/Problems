static bool cmp(string a, string b) {
	return a + b > b + a;
}

string Solution::largestNumber(const vector<int> &A) {

	string rv;
	vector<string> str;
	for (int i = 0; i < A.size(); i++) {
		str.push_back(to_string(A[i]));
	}
	sort(str.begin(), str.end(), cmp);
	//create a string from the sorted dynamic array of strings
	for (int i = 0; i < str.size(); i++) {
		rv += str[i];
	}

	// for boundary case where input is zero eg - [0,0,0,0,0,0,0]
	int j = 0;
	while (rv[j] == '0' && j + 1 < rv.size())
		j++;

	return rv.substr(j);

}