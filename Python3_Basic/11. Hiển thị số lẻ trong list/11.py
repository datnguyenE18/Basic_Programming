n = int( input() )
lst = []

#Nhập list:
for i in range( n ):
    lst.append( int( input() ) )

ans = []
#Solve:
for j in lst:
    if j % 2 != 0:
        ans.append( j )
print( ans )

'''
7
2
4
6
1
9
5
8
[1, 9, 5]
'''