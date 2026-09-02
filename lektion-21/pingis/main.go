package main

import (
	"fmt"
	"math/rand/v2"
	"time"
)

func main() {
	ch := make(chan bool);
	
	go ping(ch, 1);
	go ping(ch, 2);
	
	select {};
}

func ping(ch chan<-bool, id int) {
	time.Sleep(1 * time.Second);
	hit := rand.IntN(4);
	fmt.Print(id);
	if hit == 0 { // miss
		fmt.Println(" just missed the ball!");
		ch <- false;
	} else { // hit
		fmt.Println(" just hit the ball!");
		ch <- true;
	}
}