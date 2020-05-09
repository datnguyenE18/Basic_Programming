def sum_of_list( lst ):
    return sum( lst )

lst = []
n = int( input() )
for i in range( n ):
    lst.append( int( input() ) )
print( sum_of_list( lst ) )

'''
5
1
6
7
4
2
20
'''