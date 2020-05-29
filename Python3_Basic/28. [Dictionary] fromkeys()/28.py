info = ( "value", "age", "score" )

first_friend = dict.fromkeys( info )
print( first_friend )

first_friend = dict.fromkeys( info , 20 )
print( first_friend )

'''
{'value': None, 'age': None, 'score': None}
{'value': 20, 'age': 20, 'score': 20}
'''