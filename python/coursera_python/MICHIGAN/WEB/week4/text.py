str = open('TEXT', 'r').read()
print str

import pyttsx
engine = pyttsx.init()
engine.say(str)
#engine.say('How are you today?')
engine.runAndWait()
