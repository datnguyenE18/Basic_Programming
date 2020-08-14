# __doc__ sẽ trả về chuỗi docstring mô tả của lớp đó

class MyClass:
     "Đây là class thứ 2 được khởi tạo"
     a = 10

# Output: 10
print(MyClass.a)

# Output: 'Đây là class thứ 2 được khởi tạo'
print(MyClass.__doc__)