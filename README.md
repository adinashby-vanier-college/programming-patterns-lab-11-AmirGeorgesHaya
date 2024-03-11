[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/KpLuhJXn)
# Programming Patterns - Lab 11

This template repository is the starter project for Programming Patterns Lab 11. Written in Java, and tested with Gradle/JUnit.

### Question(s)

Given an array of strings strs, group **the anagrams** together. You can return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]  
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:

Input: strs = [""]  
Output: [[""]]

Example 3:

Input: strs = ["a"]  
Output: [["a"]]

**Constraints**

1 <= strs.length <= 104  
0 <= strs[i].length <= 100  
strs[i] consists of lowercase English letters.

### Setup Command

`gradle clean`

### Run Command

`gradle test`
