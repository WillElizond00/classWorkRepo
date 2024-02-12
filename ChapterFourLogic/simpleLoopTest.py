def main():
    #list of names 
    varName1 = ['Winken', 'Blinken', 'Nod']
    varName2 = ('Winken', 'Blinken', 'Nod')

    for name in ['Winken', 'Blinken', 'Nod']:
        print(name)
        #tuple of names 
    for name2 in ('Winken', 'Blinken', 'Nod'):
        print(name2)

    print("Here are the elements: \n")
    print(varName1[2])

    varName1[2] = 'Amoa'
    varName1.append('Bauer')
    varName1.insert(1, 'Daland')
    
    print(varName1)
    print(varName2)




main()