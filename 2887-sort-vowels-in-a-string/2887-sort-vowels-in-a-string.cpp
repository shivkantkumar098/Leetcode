class Solution {
public:
bool isVowel(char i) {
    switch(i) {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
            return true;
        default:
            return false;
    }
    return false;
}

    string sortVowels(string s) {
    vector<char> res;

    // Extract vowels from the input string and store them in the 'res' vector.
    for(char i : s) {
        if(isVowel(i)) {
            res.push_back(i);
        }
    }

    // Sort the vowels in the 'res' vector.
    sort(res.begin(), res.end());

    // Replace the original vowels in the input string with the sorted vowels.
    for(int i = 0, j = 0; i < s.size(); i++) {
        if(isVowel(s[i])) {
            s[i] = res[j];
            j++;
        }
    }

    return s;
}

};