alphabet = ['a', 'b', 'd', 'e', 'i', 'j', 'o', 'w', 'n']
vowel = ['u', 'e', 'o', 'a', 'i']

def check( a ):
    if (a in vowel):
        return True
    else:
        return False

vowel_sound = filter( check, alphabet )
print( list( vowel_sound ) )
