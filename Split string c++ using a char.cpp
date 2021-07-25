vector<string> split(string s, char c) {
        vector<string> parts;
        string part;
        istringstream in(s);
        while (getline(in, part, c)) {
            parts.push_back(part);
        }
        return parts;
    }


vector<string> tokenize(string s, string del)
{
    vector<string> parts;
    int start = 0;
    int end = s.find(del);
    while (end != -1) {
        parts.push_back(s.substr(start, end - start));
        start = end + del.size();
        end = s.find(del, start);
    }
    parts.push_back(s.substr(start, end - start));
    return parts;
}
