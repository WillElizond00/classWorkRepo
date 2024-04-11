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
