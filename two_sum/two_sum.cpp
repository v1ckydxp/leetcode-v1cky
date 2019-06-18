#include <algorithm>
#include <iostream>
#include <vector>
using std::vector;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::sort(nums.begin(),nums.end());
        
        vector <int> map;
        for(int j = nums.size()-1;j>=0;j--){
            for(int i = j;i>=0;i--)
            {
                if(target >= nums[i]){
                    map.push_back(nums[i]);
                    target = target-nums[i];
                }
                if(target == 0)
                    break;   
            }
            if(map.size() == 2)
            {
               break; 
            }
        }
        
        vector <int> indexlist;
        for(int i = 0;i < nums.size() ; i++ ){
            if(nums[i]==map[0] || nums[i] == map[1])
                indexlist.push_back(i);
        }
  
        std::sort(indexlist.begin(),indexlist.end());
        return indexlist;
    }
};
