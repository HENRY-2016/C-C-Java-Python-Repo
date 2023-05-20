


import pywhatkit as py

msg = '\n\n\n Henry Says A Good Morning To You ...\n\n\n'

def send_whatsapp_message(contact,msg):
    try:
        py.sendwhatmsg_instantly(
            phone_no=contact, 
            message=msg,
        )
        print("Message sent To :: " + contact)
    except Exception as e:
        print(str(e))



if __name__ == "__main__":
    send_whatsapp_message('256701243139',msg)


