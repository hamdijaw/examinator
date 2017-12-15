# parrot = "abcdef"
# print(parrot[6])

from PIL import  Image, ImageEnhance, ImageFilter
import pytesseract
pytesseract.pytesseract.tesseract_cmd = 'C:\Program Files (x86)\Tesseract-OCR'
from io import StringIO

import stat
import os

os.chmod("sample1.jpg",stat.S_IRUSR|stat.S_IRGRP|stat.S_IROTH|stat.S_IXUSR|stat.S_IRUSR|stat.S_IWUSR|stat.S_IWGRP|stat.S_IXGRP)
# os.remove("file")

im = Image.open("sample1.jpg")
im2 = Image.open(StringIO.StringIO(buffer))

# im = Image.open("temp.jpg") # the second one
im = im.filter(ImageFilter.MedianFilter())
enhancer = ImageEnhance.Contrast(im)
im = enhancer.enhance(2)
im = im.convert('1')
im.save('temp2.jpg')
os.chmod("temp2.jpg",stat.S_IRUSR|stat.S_IRGRP|stat.S_IROTH|stat.S_IXUSR|stat.S_IRUSR|stat.S_IWUSR|stat.S_IWGRP|stat.S_IXGRP)
# text = pytesseract.image_to_string(Image.open('temp2.jpg'))
text = pytesseract.image_to_string(im)
print("hello")
print(text)

# read data from string
# im = Image.open(StringIO(data))
# im.rotate(45).show()

# text = pytesseract.image_to_string(im, lang='eng')

# print(text)
# print("abc")