temperature = int( input() )

print( "Stay at home and enjoy a good movie" if temperature >= 100
else "Stay at home" if temperature >= 92
else "Go outside and enjoy the weather" if temperature == 75
else "It's cool outside" if temperature < 0
else "Let's go to school" )