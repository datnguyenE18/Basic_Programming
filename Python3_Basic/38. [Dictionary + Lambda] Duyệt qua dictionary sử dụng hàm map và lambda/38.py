info = [{'Name' : 'Nguyen Van A', 'Points' : 8}, {'Name' : 'Nguyen Van B', 'Points' : 9}]
Name = map( lambda x : x['Name'], info )
print( list( Name ) )

Score = map( lambda y : y['Points'] * 10, info )
print( list( Score ) )

'''
['Nguyen Van A', 'Nguyen Van B']
[80, 90]
'''

"""
Trong ví dụ trên, hàm map sẽ duyệt qua info, với mỗi dict của info sẽ được truyền dưới dạng tham số cho hàm lambda, hàm lambda sẽ trả về các giá trị của các key có tên là Name / Points .

"""