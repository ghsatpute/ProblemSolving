# ZigZag Conversion

The string `PAYPALISHIRING` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

```
P   A   H   N
A P L S I I G
Y   I   R
```
And then read line by line: `PAHNAPLSIIGYIR`

Write the code that will take a string and make this conversion given a number of rows:
```
string convert(string s, int numRows);
```

**Example 1**:

```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
```


**Example 2**:
```
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
```

**Explanation**:
```
P     I    N
A   L S  I G
Y A   H R
P     I
```


-----
```
 A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
```
### Rows = 3 

``` 
A   E   I   M   Q   U
B D F H J L N P R T V
C   G   K   O   S
```

```
 A  E  I  M  Q  U
 0  4  8 12 16 20																	4
 B  D  F  H  J  L  N  P  R  T  V 
 1  3  5  7  9 11 13 15 17 19 21													2
 C  G  K  O  S 
 2  6  10 14 18																		4
``` 

### Row = 4
```
A    G    M    S
B  F H  L N  R T
C E  I K  O Q  U 
D    J    P    V 
```

```
A  G  M  S
0  6  12 18  																		6
B  F  H  L  N  R  T
1  5  7  11 13 17 19 																4 2 
C  E  I  K  O  Q  U 
2  4  8  10 14 16 20 																2 4 
D  J  P  V
3  9  15 21 																		6
```

### Rows = 5 

```
A       I       Q       Y 
B     H J     P R     X Z
C   G   K   O   S   W
D F     L N     T V
E       M       U 
```

```
A  I  Q  Y 
0  8  16 24 																		8
B  H  J  P  R  X  Z
1  7  9  15 17 23 25 																6 2
C  G  K  O  S  W 
2  6  10 14 18 22																	4
D  F  L  N  T  V 
3  5  11 13 19 21																	2 6
E  M  U 
4  12 20																			8
```

```
 A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
```
### Rows = 6

```
A         K         U
B       J L       T V
C     I   M     S   W
D   H     N   R     X
E G       O Q       Y
F         P         Z
```

```
A  K  U
0  10 20																			10 
B  J  L  T  V
1  9  11 19 21 																		8 2 
C  I  M  S  W 
2  8  12 18 22																		6 4 
D  H  N  R  X
3  7  13 17 23																		4 6
E  G  O  Q  Y 
4  6  14 16 24																		2 8
F  P  Z 
5  15 25																		 	10
```

```
 A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
```
 
### Rows = 7 
```
A       M       Y
B     L N     X Z
C    K  O    W
D   J   P   V
E  I    Q  U
F H     R T
G       S
```
```
A  M  Y
0  12 24																			12 
B  L  N  X  Z 
1  11 13 23 25 																		10 2 
C  K  O  W
2  10 14 22																			8  4 
D  J  P  V 
3  9  15 21																			6  6
E  I  Q  U 
4  8  16 20 																		4  8
F  H  R  T
5  7  17 19 																		2 10 
G  S 
6  18 																				12
```

```
 A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
 ```
 
### Rows = 8 
```
A        O
B      N P
C     M  Q
D    L   R    Z
E   K    S   Y
F  J     T  X
G I      U W
H        V
```
```
A  O 
0  14																				14 
B  N  P
1  13 																				12
C  M  Q 
2  12 16																			10 4
D  L  R  Z
3  11 17 25																			8  6
E  K  S  Y 
4  10 18 24 																		6  8
F  J  T  X 
5  9  19 23																			4  10 
G  I  U  W
6  8  20 22																			2  12 
H  V  
7  21																				14
```