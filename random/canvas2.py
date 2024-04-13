<<<<<<< HEAD
str = "Yada yada yada"

str.delete(4, 9)

print(str)
=======
def convert_t_to_uppercase(str):
    new_str = ""
    for character in str:
        if character == 't':
            new_str += 'T'
        else:
            new_str += character
    return new_str

# Example usage
input_str = "test string with some ts"
converted_str = convert_t_to_uppercase(input_str)
print(converted_str)
>>>>>>> 89668bda470c56cd46f2da8c0cad784c7e271e92
