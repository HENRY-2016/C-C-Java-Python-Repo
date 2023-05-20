

import pywhatkit as py

Contacts=[            
    "+256705718688",
    "+256773876383",
    "+256709238102",
    "+256706484834",
]

for number in Contacts:
    py.sendwhatmsg_instantly(number,'He Also \n\n Wishes You \n A Good Day...')
    print("==> Msg Sent Well To :: " + number)
