def bubbleSort(array):
    arrayLen = len(array)

    for i in range (arrayLen):
        for j in range (0, arrayLen - i -1):
            if array[j] > array[j+1]:
                tempBox = array[j]
                array[j] = array[j+1]
                array[j+1] = tempBox


data = [ 3, 67, 1, 6, 42]

bubbleSort(data)
print(data)
