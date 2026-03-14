# 🧠 DSA Patterns Sheet — Thita.ai

> **Author Sheet with progress tracking:** [thita.ai/dsa-patterns-sheet](https://thita.ai/dsa-patterns-sheet)  
> **Theory for DSA:** [thita.ai/dashboard/learning-path/dsa](https://thita.ai/dashboard/learning-path/dsa)  
> **Discord Community:** [discord.gg/zxywjSuvDT](https://discord.gg/zxywjSuvDT)  
> **Video Playlist (new videos added weekly):** [YouTube](https://www.youtube.com/watch?v=DKWEYzF2xJU&list=PL2SB3o9_VW78xKoiCPtzLnTWjMOklYlNy)  
> **Google Sheet:** [Full Sheet with Tracking](https://docs.google.com/spreadsheets/d/1EEYzyD_483B-7CmWxsJB_zycdv4Y5dxnzcoEQtaIfuk/edit?gid=2094977620#gid=2094977620)

---

## 📋 Table of Contents

| # | Category |
|---|----------|
| I | [Two Pointer Patterns](#i-two-pointer-patterns) |
| II | [Sliding Window Patterns](#ii-sliding-window-patterns) |
| III | [Tree Traversal Patterns (DFS & BFS)](#iii-tree-traversal-patterns-dfs--bfs) |
| IV | [Graph Traversal Patterns (DFS & BFS)](#iv-graph-traversal-patterns-dfs--bfs) |
| V | [Dynamic Programming (DP) Patterns](#v-dynamic-programming-dp-patterns) |
| VI | [Heap (Priority Queue) Patterns](#vi-heap-priority-queue-patterns) |
| VII | [Backtracking Patterns](#vii-backtracking-patterns) |
| VIII | [Greedy Patterns](#viii-greedy-patterns) |
| IX | [Binary Search Patterns](#ix-binary-search-patterns) |
| X | [Stack Patterns](#x-stack-patterns) |
| XI | [Bit Manipulation Patterns](#xi-bit-manipulation-patterns) |
| XII | [Linked List Manipulation Patterns](#xii-linked-list-manipulation-patterns) |
| XIII | [Array / Matrix Manipulation Patterns](#xiii-array--matrix-manipulation-patterns) |
| XIV | [String Manipulation Patterns](#xiv-string-manipulation-patterns) |
| XV | [Design Patterns](#xv-design-patterns) |

> ⏱️ **Short on time?** Follow the **30-day sheet** to get a gist of all patterns quickly.

---

## I. Two Pointer Patterns

### Pattern 1 — Converging Pointers
> Both pointers start from opposite ends and move toward each other.

| # | Problem |
|---|---------|
| 11 | Container With Most Water |
| 15 | 3Sum |
| 16 | 3Sum Closest |
| 18 | 4Sum |
| 167 | Two Sum II - Input Array Is Sorted |
| 259 | 3Sum Smaller |
| 349 | Intersection of Two Arrays |
| 881 | Boats to Save People |
| 977 | Squares of a Sorted Array |

---

### Pattern 2 — Fast & Slow Pointers
> One pointer moves faster than the other; useful for cycle detection.

| # | Problem |
|---|---------|
| 141 | Linked List Cycle |
| 202 | Happy Number |
| 287 | Find the Duplicate Number |
| 392 | Is Subsequence |

---

### Pattern 3 — Fixed Separation Pointers
> Two pointers maintained at a fixed distance apart.

| # | Problem |
|---|---------|
| 19 | Remove Nth Node From End of List |
| 876 | Middle of the Linked List |
| 2095 | Delete the Middle Node of a Linked List |

---

### Pattern 4 — In-place Array Modification
> Modify arrays in-place using a read and write pointer.

| # | Problem |
|---|---------|
| 26 | Remove Duplicates from Sorted Array |
| 27 | Remove Element |
| 75 | Sort Colors |
| 80 | Remove Duplicates from Sorted Array II |
| 283 | Move Zeroes |
| 443 | String Compression |
| 905 | Sort Array By Parity |
| 2337 | Move Pieces to Obtain a String |
| 2938 | Separate Black and White Balls |

---

### Pattern 5 — String Comparison with Special Characters
> Handle special characters like backspaces during string comparison.

| # | Problem |
|---|---------|
| 844 | Backspace String Compare |
| 1598 | Crawler Log Folder |
| 2390 | Removing Stars From a String |

---

### Pattern 6 — Expanding From Center
> Expand outward from a center point to find palindromic structures.

| # | Problem |
|---|---------|
| 5 | Longest Palindromic Substring |
| 647 | Palindromic Substrings |

---

### Pattern 7 — String Reversal
> Reverse strings or parts of strings in-place.

| # | Problem |
|---|---------|
| 151 | Reverse Words in a String |
| 344 | Reverse String |
| 345 | Reverse Vowels of a String |
| 541 | Reverse String II |

---

## II. Sliding Window Patterns

### Pattern 8 — Fixed Size Window
> Window size is constant throughout traversal.

| # | Problem |
|---|---------|
| 346 | Moving Average from Data Stream |
| 643 | Maximum Average Subarray I |
| 2985 | Calculate Compressed Mean |
| 3254 | Find the Power of K-Size Subarrays I |
| 3318 | Find X-Sum of All K-Long Subarrays I |

---

### Pattern 9 — Variable Size Window
> Window grows and shrinks based on a condition.

| # | Problem |
|---|---------|
| 3 | Longest Substring Without Repeating Characters |
| 76 | Minimum Window Substring |
| 209 | Minimum Size Subarray Sum |
| 219 | Contains Duplicate II |
| 424 | Longest Repeating Character Replacement |
| 713 | Subarray Product Less Than K |
| 904 | Fruit Into Baskets |
| 1004 | Max Consecutive Ones III |
| 1438 | Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit |
| 1493 | Longest Subarray of 1's After Deleting One Element |

---

### Pattern 10 — Monotonic Queue for Max/Min
> Use a deque to efficiently track max/min in a sliding window.

| # | Problem |
|---|---------|
| 239 | Sliding Window Maximum |
| 862 | Shortest Subarray with Sum at Least K |
| 1696 | Jump Game VI |

---

### Pattern 11 — Character Frequency Matching
> Track character frequencies to find anagram or permutation windows.

| # | Problem |
|---|---------|
| 1 | Two Sum |
| 438 | Find All Anagrams in a String |
| 567 | Permutation in String |

---

## III. Tree Traversal Patterns (DFS & BFS)

### Pattern 12 — Level Order Traversal (BFS)
> Process tree level by level using a queue.

| # | Problem |
|---|---------|
| 102 | Binary Tree Level Order Traversal |
| 103 | Binary Tree Zigzag Level Order Traversal |
| 199 | Binary Tree Right Side View |
| 515 | Find Largest Value in Each Tree Row |
| 1161 | Maximum Level Sum of a Binary Tree |

---

### Pattern 13 — Recursive Preorder Traversal
> Visit: Root → Left → Right.

| # | Problem |
|---|---------|
| 100 | Same Tree |
| 101 | Symmetric Tree |
| 105 | Construct Binary Tree from Preorder and Inorder Traversal |
| 114 | Flatten Binary Tree to Linked List |
| 226 | Invert Binary Tree |
| 257 | Binary Tree Paths |
| 988 | Smallest String Starting From Leaf |

---

### Pattern 14 — Recursive Inorder Traversal
> Visit: Left → Root → Right. Gives sorted order for BST.

| # | Problem |
|---|---------|
| 94 | Binary Tree Inorder Traversal |
| 98 | Validate Binary Search Tree |
| 173 | Binary Search Tree Iterator |
| 230 | Kth Smallest Element in a BST |
| 501 | Find Mode in Binary Search Tree |
| 530 | Minimum Absolute Difference in BST |

---

### Pattern 15 — Recursive Postorder Traversal
> Visit: Left → Right → Root. Good for bottom-up computations.

| # | Problem |
|---|---------|
| 104 | Maximum Depth of Binary Tree |
| 110 | Balanced Binary Tree |
| 124 | Binary Tree Maximum Path Sum |
| 145 | Binary Tree Postorder Traversal |
| 337 | House Robber III |
| 366 | Find Leaves of Binary Tree |
| 543 | Diameter of Binary Tree |
| 863 | All Nodes Distance K in Binary Tree |
| 1110 | Delete Nodes And Return Forest |
| 2458 | Height of Binary Tree After Subtree Removal Queries |

---

### Pattern 16 — Lowest Common Ancestor (LCA)

| # | Problem |
|---|---------|
| 235 | Lowest Common Ancestor of a Binary Search Tree |
| 236 | Lowest Common Ancestor of a Binary Tree |

---

### Pattern 17 — Serialization and Deserialization

| # | Problem |
|---|---------|
| 297 | Serialize and Deserialize Binary Tree |
| 572 | Subtree of Another Tree |
| 652 | Find Duplicate Subtrees |

---

## IV. Graph Traversal Patterns (DFS & BFS)

### Pattern 18 — DFS: Connected Components / Island Counting

| # | Problem |
|---|---------|
| 130 | Surrounded Regions |
| 200 | Number of Islands |
| 417 | Pacific Atlantic Water Flow |
| 547 | Number of Provinces |
| 695 | Max Area of Island |
| 733 | Flood Fill |
| 841 | Keys and Rooms |
| 1020 | Number of Enclaves |
| 1254 | Number of Closed Islands |
| 1905 | Count Sub Islands |
| 2101 | Detonate the Maximum Bombs |

---

### Pattern 19 — BFS: Connected Components / Island Counting

| # | Problem |
|---|---------|
| 542 | 01 Matrix |
| 994 | Rotting Oranges |
| 1091 | Shortest Path in Binary Matrix |

---

### Pattern 20 — DFS: Cycle Detection

| # | Problem |
|---|---------|
| 207 | Course Schedule |
| 210 | Course Schedule II |
| 802 | Find Eventual Safe States |
| 1059 | All Paths from Source Lead to Destination |

---

### Pattern 21 — BFS: Topological Sort (Kahn's Algorithm)

| # | Problem |
|---|---------|
| 210 | Course Schedule II |
| 269 | Alien Dictionary |
| 310 | Minimum Height Trees |
| 444 | Sequence Reconstruction |
| 1136 | Parallel Courses |
| 1857 | Largest Color Value in a Directed Graph |
| 2050 | Parallel Courses III |
| 2115 | Find All Possible Recipes from Given Supplies |
| 2392 | Build a Matrix With Conditions |

---

### Pattern 22 — Deep Copy / Cloning

| # | Problem |
|---|---------|
| 133 | Clone Graph |
| 138 | Copy List with Random Pointer |
| 1334 | Find the City With the Smallest Number of Neighbors at a Threshold Distance |
| 1490 | Clone N-ary Tree |

---

### Pattern 23 — Shortest Path (Dijkstra / BFS)

| # | Problem |
|---|---------|
| 743 | Network Delay Time |
| 778 | Swim in Rising Water |
| 1514 | Path with Maximum Probability |
| 1631 | Path With Minimum Effort |
| 1976 | Number of Ways to Arrive at Destination |
| 2045 | Second Minimum Time to Reach Destination |
| 2203 | Minimum Weighted Subgraph With the Required Paths |
| 2290 | Minimum Obstacle Removal to Reach Corner |
| 2577 | Minimum Time to Visit a Cell In a Grid |
| 2812 | Find the Safest Path in a Grid |

---

### Pattern 24 — Shortest Path (Bellman-Ford / BFS+K)

| # | Problem |
|---|---------|
| 787 | Cheapest Flights Within K Stops |
| 1129 | Shortest Path with Alternating Colors |

---

### Pattern 25 — Union-Find (DSU)

| # | Problem |
|---|---------|
| 200 | Number of Islands |
| 261 | Graph Valid Tree |
| 305 | Number of Islands II |
| 323 | Number of Connected Components in an Undirected Graph |
| 547 | Number of Provinces |
| 684 | Redundant Connection |
| 721 | Accounts Merge |
| 737 | Sentence Similarity II |
| 947 | Most Stones Removed with Same Row or Column |
| 952 | Largest Component Size by Common Factor |
| 959 | Regions Cut By Slashes |
| 1101 | The Earliest Moment When Everyone Become Friends |

---

### Pattern 26 — Strongly Connected Components (Kosaraju / Tarjan)

| # | Problem |
|---|---------|
| 210 | Course Schedule II |
| 547 | Number of Provinces |
| 1192 | Critical Connections in a Network |
| 2127 | Maximum Employees to Be Invited to a Meeting |

---

### Pattern 27 — Bridges & Articulation Points (Tarjan Low-Link)

| # | Problem |
|---|---------|
| 1192 | Critical Connections in a Network |
| 2360 | Longest Cycle in a Graph |

---

### Pattern 28 — Minimum Spanning Tree (Kruskal / Prim / DSU + Heap)

| # | Problem |
|---|---------|
| 1135 | Connecting Cities With Minimum Cost |
| 1168 | Optimize Water Distribution in a Village |
| 1489 | Find Critical and Pseudo-Critical Edges in Minimum Spanning Tree |
| 1584 | Min Cost to Connect All Points |

---

### Pattern 29 — Bidirectional BFS

| # | Problem |
|---|---------|
| 126 | Word Ladder II |
| 127 | Word Ladder |
| 815 | Bus Routes |

---

## V. Dynamic Programming (DP) Patterns

### Pattern 30 — Fibonacci Style DP

| # | Problem |
|---|---------|
| 70 | Climbing Stairs |
| 91 | Decode Ways |
| 198 | House Robber |
| 213 | House Robber II |
| 337 | House Robber III |
| 509 | Fibonacci Number |
| 740 | Delete and Earn |
| 746 | Min Cost Climbing Stairs |

---

### Pattern 31 — Kadane's Algorithm (Max/Min Subarray)

| # | Problem |
|---|---------|
| 53 | Maximum Subarray |
| 152 | Maximum Product Subarray |
| 918 | Maximum Sum Circular Subarray |
| 1749 | Maximum Absolute Sum of Any Subarray |
| 2321 | Maximum Score Of Spliced Array |

---

### Pattern 32 — Coin Change / Unbounded Knapsack

| # | Problem |
|---|---------|
| 322 | Coin Change |
| 377 | Combination Sum IV |
| 518 | Coin Change II |

---

### Pattern 33 — 0/1 Knapsack / Subset Sum

| # | Problem |
|---|---------|
| 416 | Partition Equal Subset Sum |
| 494 | Target Sum |

---

### Pattern 34 — Word Break Style

| # | Problem |
|---|---------|
| 139 | Word Break |
| 140 | Word Break II |

---

### Pattern 35 — Longest Common Subsequence (LCS)

| # | Problem |
|---|---------|
| 1092 | Shortest Common Supersequence |
| 1143 | Longest Common Subsequence |
| 1312 | Minimum Insertion Steps to Make a String Palindrome |

---

### Pattern 36 — Edit Distance / Levenshtein Distance

| # | Problem |
|---|---------|
| 72 | Edit Distance |
| 583 | Delete Operation for Two Strings |
| 712 | Minimum ASCII Delete Sum for Two Strings |

---

### Pattern 37 — Unique Paths on Grid

| # | Problem |
|---|---------|
| 62 | Unique Paths |
| 63 | Unique Paths II |
| 64 | Minimum Path Sum |
| 120 | Triangle |
| 221 | Maximal Square |
| 931 | Minimum Falling Path Sum |
| 1277 | Count Square Submatrices with All Ones |

---

### Pattern 38 — Interval DP

| # | Problem |
|---|---------|
| 312 | Burst Balloons |
| 546 | Remove Boxes |

---

### Pattern 39 — Catalan Numbers

| # | Problem |
|---|---------|
| 95 | Unique Binary Search Trees II |
| 96 | Unique Binary Search Trees |
| 241 | Different Ways to Add Parentheses |

---

### Pattern 40 — Longest Increasing Subsequence (LIS)

| # | Problem |
|---|---------|
| 300 | Longest Increasing Subsequence |
| 354 | Russian Doll Envelopes |
| 1671 | Minimum Number of Removals to Make Mountain Array |
| 2407 | Longest Increasing Subsequence II |

---

### Pattern 41 — Stock Problems

| # | Problem |
|---|---------|
| 121 | Best Time to Buy and Sell Stock |
| 122 | Best Time to Buy and Sell Stock II |
| 123 | Best Time to Buy and Sell Stock III |
| 188 | Best Time to Buy and Sell Stock IV |
| 309 | Best Time to Buy and Sell Stock with Cooldown |

---

## VI. Heap (Priority Queue) Patterns

### Pattern 42 — Top K Elements

| # | Problem |
|---|---------|
| 215 | Kth Largest Element in an Array |
| 347 | Top K Frequent Elements |
| 451 | Sort Characters By Frequency |
| 506 | Relative Ranks |
| 703 | Kth Largest Element in a Stream |
| 973 | K Closest Points to Origin |
| 1046 | Last Stone Weight |
| 2558 | Take Gifts From the Richest Pile |

---

### Pattern 43 — Two Heaps for Median Finding

| # | Problem |
|---|---------|
| 295 | Find Median from Data Stream |
| 1825 | Finding MK Average |

---

### Pattern 44 — K-way Merge

| # | Problem |
|---|---------|
| 23 | Merge k Sorted Lists |
| 373 | Find K Pairs with Smallest Sums |
| 378 | Kth Smallest Element in a Sorted Matrix |
| 632 | Smallest Range Covering Elements from K Lists |

---

### Pattern 45 — Scheduling / Minimum Cost

| # | Problem |
|---|---------|
| 253 | Meeting Rooms II |
| 767 | Reorganize String |
| 857 | Minimum Cost to Hire K Workers |
| 1642 | Furthest Building You Can Reach |
| 1792 | Maximum Average Pass Ratio |
| 1834 | Single-Threaded CPU |
| 1942 | The Number of the Smallest Unoccupied Chair |
| 2402 | Meeting Rooms III |

---

## VII. Backtracking Patterns

### Pattern 46 — Subsets (Include / Exclude)

| # | Problem |
|---|---------|
| 17 | Letter Combinations of a Phone Number |
| 77 | Combinations |
| 78 | Subsets |
| 90 | Subsets II |

---

### Pattern 47 — Permutations

| # | Problem |
|---|---------|
| 31 | Next Permutation |
| 46 | Permutations |
| 60 | Permutation Sequence |

---

### Pattern 48 — Combination Sum

| # | Problem |
|---|---------|
| 39 | Combination Sum |
| 40 | Combination Sum II |

---

### Pattern 49 — Parentheses Generation

| # | Problem |
|---|---------|
| 22 | Generate Parentheses |
| 301 | Remove Invalid Parentheses |

---

### Pattern 50 — Word Search / Path Finding in Grid

| # | Problem |
|---|---------|
| 79 | Word Search |
| 212 | Word Search II |
| 2018 | Check if Word Can Be Placed In Crossword |

---

### Pattern 51 — N-Queens / Constraint Satisfaction

| # | Problem |
|---|---------|
| 37 | Sudoku Solver |
| 51 | N-Queens |

---

### Pattern 52 — Palindrome Partitioning

| # | Problem |
|---|---------|
| 131 | Palindrome Partitioning |
| 132 | Palindrome Partitioning II |
| 1457 | Pseudo-Palindromic Paths in a Binary Tree |

---

## VIII. Greedy Patterns

### Pattern 53 — Interval Merging / Scheduling

| # | Problem |
|---|---------|
| 56 | Merge Intervals |
| 57 | Insert Interval |
| 759 | Employee Free Time |
| 986 | Interval List Intersections |
| 2406 | Divide Intervals Into Minimum Number of Groups |

---

### Pattern 54 — Jump Game Reachability / Minimization

| # | Problem |
|---|---------|
| 45 | Jump Game II |
| 55 | Jump Game |

---

### Pattern 55 — Buy / Sell Stock (Greedy)

| # | Problem |
|---|---------|
| 121 | Best Time to Buy and Sell Stock |
| 122 | Best Time to Buy and Sell Stock II |

---

### Pattern 56 — Gas Station Circuit

| # | Problem |
|---|---------|
| 134 | Gas Station |
| 2202 | Maximize the Topmost Element After K Moves |

---

### Pattern 57 — Task Scheduling

| # | Problem |
|---|---------|
| 621 | Task Scheduler |
| 767 | Reorganize String |
| 1054 | Distant Barcodes |

---

### Pattern 58 — Sorting Based Greedy

| # | Problem |
|---|---------|
| 135 | Candy |
| 406 | Queue Reconstruction by Height |
| 455 | Assign Cookies |
| 1029 | Two City Scheduling |

---

## IX. Binary Search Patterns

### Pattern 59 — On Sorted Array / List

| # | Problem |
|---|---------|
| 35 | Search Insert Position |
| 69 | Sqrt(x) |
| 74 | Search a 2D Matrix |
| 278 | First Bad Version |
| 374 | Guess Number Higher or Lower |
| 540 | Single Element in a Sorted Array |
| 704 | Binary Search |
| 1539 | Kth Missing Positive Number |

---

### Pattern 60 — Find Min / Max in Rotated Sorted Array

| # | Problem |
|---|---------|
| 33 | Search in Rotated Sorted Array |
| 81 | Search in Rotated Sorted Array II |
| 153 | Find Minimum in Rotated Sorted Array |
| 162 | Find Peak Element |
| 852 | Peak Index in a Mountain Array |
| 1095 | Find in Mountain Array |

---

### Pattern 61 — Binary Search on Answer / Condition Function

| # | Problem |
|---|---------|
| 410 | Split Array Largest Sum |
| 774 | Minimize Max Distance to Gas Station |
| 875 | Koko Eating Bananas |
| 1011 | Capacity To Ship Packages Within D Days |
| 1482 | Minimum Number of Days to Make m Bouquets |
| 1760 | Minimum Limit of Balls in a Bag |
| 2064 | Minimized Maximum of Products Distributed to Any Store |
| 2226 | Maximum Candies Allocated to K Children |

---

### Pattern 62 — Find First / Last Occurrence

| # | Problem |
|---|---------|
| 34 | Find First and Last Position of Element in Sorted Array |
| 658 | Find K Closest Elements |

---

### Pattern 63 — Median / Kth across Two Sorted Arrays

| # | Problem |
|---|---------|
| 4 | Median of Two Sorted Arrays |
| 378 | Kth Smallest Element in a Sorted Matrix |
| 719 | Find K-th Smallest Pair Distance |

---

## X. Stack Patterns

### Pattern 64 — Valid Parentheses Matching

| # | Problem |
|---|---------|
| 20 | Valid Parentheses |
| 32 | Longest Valid Parentheses |
| 921 | Minimum Add to Make Parentheses Valid |
| 1249 | Minimum Remove to Make Valid Parentheses |
| 1963 | Minimum Number of Swaps to Make the String Balanced |

---

### Pattern 65 — Monotonic Stack

| # | Problem |
|---|---------|
| 402 | Remove K Digits |
| 496 | Next Greater Element I |
| 503 | Next Greater Element II |
| 739 | Daily Temperatures |
| 901 | Online Stock Span |
| 907 | Sum of Subarray Minimums |
| 962 | Maximum Width Ramp |
| 1475 | Final Prices With a Special Discount in a Shop |
| 1673 | Find the Most Competitive Subsequence |

---

### Pattern 66 — Expression Evaluation

| # | Problem |
|---|---------|
| 150 | Evaluate Reverse Polish Notation |
| 224 | Basic Calculator |
| 227 | Basic Calculator II |
| 772 | Basic Calculator III |

---

### Pattern 67 — Simulation / Backtracking Helper

| # | Problem |
|---|---------|
| 71 | Simplify Path |
| 394 | Decode String |
| 735 | Asteroid Collision |

---

### Pattern 68 — Min Stack Design

| # | Problem |
|---|---------|
| 155 | Min Stack |
| 895 | Maximum Frequency Stack |
| 901 | Online Stock Span |

---

### Pattern 69 — Largest Rectangle in Histogram

| # | Problem |
|---|---------|
| 84 | Largest Rectangle in Histogram |
| 85 | Maximal Rectangle |

---

## XI. Bit Manipulation Patterns

### Pattern 70 — Bitwise XOR: Finding Single / Missing Number

| # | Problem |
|---|---------|
| 136 | Single Number |
| 137 | Single Number II |
| 268 | Missing Number |
| 389 | Find the Difference |

---

### Pattern 71 — Bitwise AND: Counting Set Bits (Hamming Weight)

| # | Problem |
|---|---------|
| 191 | Number of 1 Bits |
| 231 | Power of Two |
| 477 | Total Hamming Distance |

---

### Pattern 72 — Bitwise DP: Counting Bits Optimization

| # | Problem |
|---|---------|
| 338 | Counting Bits |
| 1442 | Count Triplets That Can Form Two Arrays of Equal XOR |
| 1494 | Parallel Courses II |

---

### Pattern 73 — Bitwise Operations: Power of Two / Four Check

| # | Problem |
|---|---------|
| 231 | Power of Two |
| 342 | Power of Four |

---

## XII. Linked List Manipulation Patterns

### Pattern 74 — In-place Reversal

| # | Problem |
|---|---------|
| 25 | Reverse Nodes in k-Group |
| 82 | Remove Duplicates from Sorted List II |
| 83 | Remove Duplicates from Sorted List |
| 92 | Reverse Linked List II |
| 206 | Reverse Linked List |
| 234 | Palindrome Linked List |

---

### Pattern 75 — Merging Two Sorted Lists

| # | Problem |
|---|---------|
| 21 | Merge Two Sorted Lists |
| 23 | Merge k Sorted Lists |

---

### Pattern 76 — Addition of Numbers

| # | Problem |
|---|---------|
| 2 | Add Two Numbers |
| 369 | Plus One Linked List |

---

### Pattern 77 — Intersection Detection

| # | Problem |
|---|---------|
| 160 | Intersection of Two Linked Lists |
| 599 | Minimum Index Sum of Two Lists |

---

### Pattern 78 — Reordering / Partitioning

| # | Problem |
|---|---------|
| 24 | Swap Nodes in Pairs |
| 61 | Rotate List |
| 86 | Partition List |
| 143 | Reorder List |
| 328 | Odd Even Linked List |

---

## XIII. Array / Matrix Manipulation Patterns

### Pattern 79 — In-place Rotation

| # | Problem |
|---|---------|
| 48 | Rotate Image |
| 189 | Rotate Array |
| 867 | Transpose Matrix |

---

### Pattern 80 — Spiral Traversal

| # | Problem |
|---|---------|
| 54 | Spiral Matrix |
| 59 | Spiral Matrix II |
| 885 | Spiral Matrix III |
| 2326 | Spiral Matrix IV |

---

### Pattern 81 — In-place Marking

| # | Problem |
|---|---------|
| 73 | Set Matrix Zeroes |
| 289 | Game of Life |
| 498 | Diagonal Traverse |

---

### Pattern 82 — Prefix / Suffix Products

| # | Problem |
|---|---------|
| 238 | Product of Array Except Self |
| 845 | Longest Mountain in Array |
| 2483 | Minimum Penalty for a Shop |

---

### Pattern 83 — Plus One / Array Addition

| # | Problem |
|---|---------|
| 43 | Multiply Strings |
| 66 | Plus One |
| 67 | Add Binary |
| 989 | Add to Array-Form of Integer |

---

### Pattern 84 — In-place from End

| # | Problem |
|---|---------|
| 88 | Merge Sorted Array |
| 977 | Squares of a Sorted Array |

---

### Pattern 85 — Cyclic Sort

| # | Problem |
|---|---------|
| 41 | First Missing Positive |
| 268 | Missing Number |
| 287 | Find the Duplicate Number |
| 442 | Find All Duplicates in an Array |
| 448 | Find All Numbers Disappeared in an Array |

---

## XIV. String Manipulation Patterns

### Pattern 86 — Palindrome Check

| # | Problem |
|---|---------|
| 9 | Palindrome Number |
| 125 | Valid Palindrome |
| 680 | Valid Palindrome II |

---

### Pattern 87 — Anagram Check

| # | Problem |
|---|---------|
| 49 | Group Anagrams |
| 242 | Valid Anagram |

---

### Pattern 88 — Roman to Integer Conversion

| # | Problem |
|---|---------|
| 12 | Integer to Roman |
| 13 | Roman to Integer |

---

### Pattern 89 — String to Integer (atoi)

| # | Problem |
|---|---------|
| 8 | String to Integer (atoi) |
| 65 | Valid Number |

---

### Pattern 90 — Manual Simulation / Big Number Arithmetic

| # | Problem |
|---|---------|
| 43 | Multiply Strings |
| 67 | Add Binary |
| 415 | Add Strings |

---

### Pattern 91 — String Matching (Naive / KMP / Rabin-Karp)

| # | Problem |
|---|---------|
| 28 | Find the Index of the First Occurrence in a String |
| 214 | Shortest Palindrome |
| 686 | Repeated String Match |
| 796 | Rotate String |
| 3008 | Find Beautiful Indices in the Given Array II |

---

### Pattern 92 — Repeated Substring Pattern Detection

| # | Problem |
|---|---------|
| 28 | Find the Index of the First Occurrence in a String |
| 459 | Repeated Substring Pattern |
| 686 | Repeated String Match |

---

### Pattern 94 — Tries (Prefix Trees)

| # | Problem |
|---|---------|
| 208 | Implement Trie (Prefix Tree) |
| 211 | Design Add and Search Words Data Structure |
| 425 | Word Squares |
| 642 | Design Search Autocomplete System |
| 648 | Replace Words |
| 720 | Longest Word in Dictionary |
| 745 | Prefix and Suffix Search |

---

## XV. Design Patterns

### Pattern 93 — General / Specific Design

| # | Problem |
|---|---------|
| 146 | LRU Cache |
| 155 | Min Stack |
| 225 | Implement Stack using Queues |
| 232 | Implement Queue using Stacks |
| 251 | Flatten 2D Vector |
| 271 | Encode and Decode Strings |
| 295 | Find Median from Data Stream |
| 341 | Flatten Nested List Iterator |
| 346 | Moving Average from Data Stream |
| 353 | Design Snake Game |
| 359 | Logger Rate Limiter |
| 362 | Design Hit Counter |
| 379 | Design Phone Directory |
| 380 | Insert Delete GetRandom O(1) |
| 432 | All O`one Data Structure |

---

> 📌 *This sheet is based on the Thita.ai DSA Patterns curriculum by Swati Ahuja.*  
> *Star the sheet, join the Discord, and track your progress at [thita.ai](https://thita.ai)*
