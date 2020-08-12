people = {
    'Ten': 'Hoang', 
    'Tuoi': 20
    }

print( people.keys() )

# When an item is added in the dictionary, the view object also gets updated:
people['school'] = 'PTIT'
print( people.keys() )

'''
dict_keys(['Ten', 'Tuoi'])
dict_keys(['Ten', 'Tuoi', 'school'])
'''