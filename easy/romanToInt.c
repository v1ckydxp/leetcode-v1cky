int romanToInt(char * s){
    int len = strlen(s);
    int map[26] = {0};

    map['I'-'A'] = 1;
    map['V'-'A'] = 5;
    map['X'-'A'] = 10;
    map['L'-'A'] = 50;
    map['C'-'A'] = 100;
    map['D'-'A'] = 500;
    map['M'-'A'] = 1000;

    int sum = 0;
    int i = 0;
    for(; i < len;i++){
	    if(i == len-1)
	        sum += map[s[i] - 'A'];
	    else{
	        int first = map[s[i] - 'A'];
	        int second = map[s[i+1] - 'A'];
	        if(first < second){ 
		        sum += second - first;
		        i++;
	         }
	        else
		    sum += first;
	    }

    }

    return sum;

}

