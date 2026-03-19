package main

import "fmt"

func main() {
	fmt.Print()
}

func deadlock() {
	ch := make(chan int)
	ch <- 3
	fmt.Print(<-ch)
}

func add(a int, b int) int {
	return a + b
}

func getAddXFunc(x int) func(int) int {
	function := func(i int) int {
		return i + x
	}
	return function
}

func _map(f func(int) int, list []int) []int {
	newList := make([]int, len(list))

	for i := 0; i < len(list); i++ {
		newList[i] = f(list[i])
	}

	return newList
}

func square(x int) int {
	return x * x
}
