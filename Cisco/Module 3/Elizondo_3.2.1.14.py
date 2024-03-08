blocks = int(input("Enter the number of blocks: "))

height = 0 # Start with no layers
layer = 1 # Blocks needed for the next layer

while blocks >= layer:
    height += 1 # Add a layer to the pyramid
    blocks -= layer # Use up blocks for this layer
    layer += 1 # Next layer needs one more block

print("The height of the pyramid:", height)