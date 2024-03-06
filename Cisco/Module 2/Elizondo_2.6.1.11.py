hour = int(input("Starting time (hours): "))
mins = int(input("Starting time (minutes): "))
dura = int(input("Event duration (minutes): "))

# Write your code here.
# Add the duration to the starting minutes
minutes = dura + mins
# Convert excess minutes to hours
extra_hours = minutes // 60
remaining_mins = minutes % 60
# Add the extra hours to the starting hours
total_hours = hour + extra_hours
#Adjust if the total exceeds 23, to wrap around the clock
final_hours = total_hours % 24

#result 

print(f"The event ends at: {final_hours:02d}:{remaining_mins:02}")