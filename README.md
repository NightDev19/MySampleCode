# Flask

Flask is a web framework, it’s a Python module that lets you develop web applications easily. It’s has a small and easy-to-extend core: it’s a microframework that doesn’t include an ORM (Object Relational Manager) or such features.

## Python Messenger

This is a python single-chat application separated on client-side and server-side. General-purpose of the project is to message between hosts in the local network. Additionally, you can download a desktop application in two versions.

## Installation

Use the package manager [pip](https://pip.pypa.io/en/stable/) to install foobar.

```bash
pip install flask
pip install py messenger==0.0.7.0
```

## Usage

```python
import random
from flask import Flask,request
from pymessenger.bot import Bot

# To create our base site 
app = Flask(__name__)

# our main Route With Api
@app.route("/", methods=['GET', 'POST'])

# commands'
def receive_message():

# verification of token
def verify_fb_token(token_sent):

#chooses a random message to send to the user
def get_message():

#uses PyMessenger to send response to user
def send_message(recipient_id, response):

#To run the code
if __name__ == "__main__":
    app.run(debug = True)
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)
