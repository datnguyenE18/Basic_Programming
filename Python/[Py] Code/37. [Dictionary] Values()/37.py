people = {
    'Ten': 'Hoang', 
    'Tuoi': 20
    }

print( people.values() )

# When an item is added in the dictionary, the view object also gets updated:
people['school'] = 'PTIT'
print( people.values() )

'''
dict_values(['Hoang', 20])
dict_values(['Hoang', 20, 'PTIT'])
'''