n = int( input() )
lst = []
for i in range( n ):
    lst.append( int( input() ) )

answer = 0
for v in lst:
    answer += v

print( answer )

'''
5
5
3
2
1
6
17
'''