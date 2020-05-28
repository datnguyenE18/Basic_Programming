friend = {"Ten": "Nguyen Van A", "Tuoi": 22}

print( friend )
x = friend.items()
print( x )

friend["Ten"] = "Tran Van B" # Đổi giá trị của Ten
friend["Truong"] = "THPT ABC" # Thêm đối tượng và giá trị Truong
x = friend.items()
print( friend )
print( x )

'''
{'Ten': 'Nguyen Van A', 'Tuoi': 22}
dict_items([('Ten', 'Nguyen Van A'), ('Tuoi', 22)])
{'Ten': 'Tran Van B', 'Tuoi': 22, 'Truong': 'THPT ABC'}
dict_items([('Ten', 'Tran Van B'), ('Tuoi', 22), ('Truong', 'THPT ABC')])
'''


