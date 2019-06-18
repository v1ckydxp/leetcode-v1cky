#!/usr/bin/python
# -*- coding: utf-8 -*-
class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        temp = target
        for i in range (len(nums)-1):
            list = {}
            temp = target
            temp = target - nums[i];
            for j in range(i+1, len(nums),1):
                if nums[j] == temp:
                    return {i,j}
            
