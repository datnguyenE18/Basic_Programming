friend = {
    "Ten": "Nguyen Van A", 
    "Tuoi": 22
    }

print( friend )
x = friend.items()
print( x, '\n' )

# When an item in the dictionary changes value, the view object also gets updated:
friend["Ten"] = "Tran Van B" # Đổi giá trị của Ten
friend["Truong"] = "THPT ABC" # Thêm đối tượng và giá trị Truong
print( "When an item in the dictionary changes value, the view object also gets updated:" ) 
print( friend,"\n", x )

'''
{'Ten': 'Nguyen Van A', 'Tuoi': 22}
dict_items([('Ten', 'Nguyen Van A'), ('Tuoi', 22)])

When an item in the dictionary changes value, the view object also gets updated:
{'Ten': 'Tran Van B', 'Tuoi': 22, 'Truong': 'THPT ABC'}
 dict_items([('Ten', 'Tran Van B'), ('Tuoi', 22), ('Truong', 'THPT ABC')])
'''


