from PIL import Image
import pytesseract

# img = Image.open('sample1.jpg')
# img = Image.open('tomorrow.png')

img = Image.open('1-OCR.tif')
pytesseract.pytesseract.tesseract_cmd = 'C:\\Program Files (x86)\\Tesseract-OCR\\tesseract.exe'
result = pytesseract.image_to_string(img)
# print(result)
# with open('tomorrow.txt', 'w', 'UTF-8') as file:
with open('tomorrow.txt', mode='w', encoding='UTF-8', errors='strict', buffering=1) as file:
    file.write(result)
    print('******done******')