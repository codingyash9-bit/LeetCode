<div align="center">

# LeetCode Practice Journal

**A Java problem-solving archive focused on reusable patterns, clear implementation, and deliberate practice.**

<p>
  <img alt="Language" src="https://img.shields.io/badge/language-Java-111827?style=flat-square">
  <img alt="Problems" src="https://img.shields.io/badge/solutions-23-334155?style=flat-square">
  <img alt="Focus" src="https://img.shields.io/badge/focus-DSA-0f766e?style=flat-square">
</p>

<p>
  <a href="#overview">Overview</a> ·
  <a href="#problem-index">Problem Index</a> ·
  <a href="#practice-map">Practice Map</a> ·
  <a href="#repository-structure">Structure</a> ·
  <a href="#progress">Progress</a>
</p>

</div>

---

## Overview

This repository records Java solutions to data-structure and algorithm problems. Each problem lives in its own directory with the original prompt and a submitted implementation, creating a searchable history of approaches across linked lists, strings, binary search, backtracking, and related patterns.

The goal is not only to accumulate accepted solutions, but to build a compact reference for recognizing patterns and discussing complexity during technical interviews.

## Practice map

| Pattern | Representative problems |
|---|---|
| Linked-list traversal | Cycle detection, intersection, middle node, duplicate removal |
| Linked-list transformation | Reversal, partial reversal, pair swapping, node removal |
| Sliding window | Longest substring without repeating characters |
| String processing | Longest common prefix, grouping anagrams, longest palindrome |
| Binary search | Integer square root, shipping capacity, Koko eating bananas |
| Backtracking | Combination sum, permutations, subsets |
| Mathematics | Factorial trailing zeroes |

## Problem index

| # | Problem | Primary pattern |
|---:|---|---|
| 2 | [Add Two Numbers](./2-add-two-numbers) | Linked lists, carry propagation |
| 3 | [Longest Substring Without Repeating Characters](./3-longest-substring-without-repeating-characters) | Sliding window |
| 5 | [Longest Palindromic Substring](./5-longest-palindromic-substring) | String expansion |
| 14 | [Longest Common Prefix](./14-longest-common-prefix) | String scanning |
| 19 | [Remove Nth Node From End](./19-remove-nth-node-from-end-of-list) | Two pointers |
| 21 | [Merge Two Sorted Lists](./21-merge-two-sorted-lists) | Linked-list merge |
| 24 | [Swap Nodes in Pairs](./24-swap-nodes-in-pairs) | Pointer manipulation |
| 39 | [Combination Sum](./39-combination-sum) | Backtracking |
| 46 | [Permutations](./46-permutations) | Backtracking |
| 49 | [Group Anagrams](./49-group-anagrams) | Hashing |
| 69 | [Sqrt(x)](./69-sqrtx) | Binary search |
| 78 | [Subsets](./78-subsets) | Backtracking |
| 83 | [Remove Duplicates From Sorted List](./83-remove-duplicates-from-sorted-list) | Linked lists |
| 92 | [Reverse Linked List II](./92-reverse-linked-list-ii) | In-place reversal |
| 1056 | [Capacity to Ship Packages Within D Days](./1056-capacity-to-ship-packages-within-d-days) | Binary search on answer |
| 141 | [Linked List Cycle](./141-linked-list-cycle) | Fast and slow pointers |
| 142 | [Linked List Cycle II](./142-linked-list-cycle-ii) | Cycle entry detection |
| 160 | [Intersection of Two Linked Lists](./160-intersection-of-two-linked-lists) | Pointer alignment |
| 172 | [Factorial Trailing Zeroes](./172-factorial-trailing-zeroes) | Number theory |
| 206 | [Reverse Linked List](./206-reverse-linked-list) | Iterative reversal |
| 234 | [Palindrome Linked List](./234-palindrome-linked-list) | Two pointers, reversal |
| 907 | [Koko Eating Bananas](./907-koko-eating-bananas) | Binary search on answer |
| 908 | [Middle of the Linked List](./908-middle-of-the-linked-list) | Fast and slow pointers |

## Repository structure

```text
problem-number-problem-name/
|-- README.md              Problem statement and constraints
`-- solution-name.java     Java implementation
```

## Review method

For each solution, the intended review sequence is:

1. Identify the data structure and dominant constraint.
2. State the brute-force approach and its cost.
3. Select the reusable pattern that removes the bottleneck.
4. Prove the core invariant.
5. Record time and space complexity.
6. Revisit the problem without reading the previous implementation.

## Progress

```text
Current solutions      23
Primary language       Java
Current emphasis       Linked lists, strings, binary search, backtracking
```

## Next improvements

- Add an approach and complexity section to every problem directory.
- Introduce automated compilation checks for all Java solutions.
- Expand coverage into trees, graphs, heaps, and dynamic programming.
- Track revision dates to distinguish first attempts from reviewed solutions.

---

<div align="center">
  <sub>Maintained by <a href="https://github.com/codingyash9-bit">Yash Mahadeshvar</a>.</sub>
</div>
