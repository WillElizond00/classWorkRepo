# William Elizondo
# 4.4.1.8 LAB: The os module
import os  # Importing the os module to interact with the operating system.

class DirectorySearcher:
    def find(self, path, dir):
        try:
            os.chdir(path)  # Attempts to change the current working directory to 'path'.
        except OSError:
            # If changing the directory fails (e.g., 'path' is not a directory), it stops the method.
            return

        current_dir = os.getcwd()  # Gets the current working directory and stores it in 'current_dir'.
        for entry in os.listdir("."):  # Iterates over all files and directories in the current directory.
            if entry == dir:
                # If the current entry matches the 'dir' we're searching for, it prints its full path.
                print(os.getcwd() + "/" + dir)
            # Recursively searches in the current entry for the directory.
            # This will dive into subdirectories to look for 'dir'.
            self.find(current_dir + "/" + entry, dir)

# Creates an instance of DirectorySearcher.
directory_searcher = DirectorySearcher()
# Starts the search in the "./tree" directory for a directory named "python".
directory_searcher.find("./tree", "python")
