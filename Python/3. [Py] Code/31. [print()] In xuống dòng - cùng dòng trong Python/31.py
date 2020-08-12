stringName = "Hello World"
number = 46513

#1.  In chuỗi và số cùng một dòng:
print( '1. ', stringName, number )

#2.  In khác dòng:
print( '2. ',stringName )
print( number )

#3.  Dùng 2 print nhưng in cùng dòng:
print( '3. ' + stringName, end = ' ' )
print( number )

#4.  Xuống dòng dùng \n trong python:
print( '4. ' + "I say:" + "\"" + stringName + "\"" + '\n', number )

'''
1.  Hello World 46513
2.  Hello World
46513
3. Hello World 46513
4. I say:"Hello World"
 46513
 '''

