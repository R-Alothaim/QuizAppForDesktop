package QuizApp;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Quiz_1 {

    static int a, b, c, d;

    static void rand() {
        Random rand = new Random();

        d = rand.nextInt(111) * rand.nextInt(111);
        switch (d % 4) {
            case 3 -> {
                a = 2;
                b = 1;
                c = 0;
                d = d % 4;
            }
            case 2 -> {
                a = 0;
                b = 3;
                c = 1;
                d = d % 4;

            }
            case 1 -> {
                a = 2;
                b = 0;
                c = 3;
                d = d % 4;

            }
            default -> {
                a = 1;
                b = 2;
                c = 3;
                d = d % 4;

            }
        }

    }

    public static void Run() throws InterruptedException {

        JFrame window = new JFrame("241");
        window.setSize(1400, 800);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        
        String[] Answer = new String[4];

        while (true) {
            int Counter = 0, score = 0, x, seconds = 0;
            int time = -1; //sec  
            quiz2[] Question = new quiz2[287];
            int i = 0;

            Answer[0] = "Secondary Storage";
            Answer[1] = "RAM";
            Answer[2] = "Cache";
            Answer[3] = "Optical disk";
            rand();
            Question[i] = new quiz2("Expansion of Main Memory that provides nonvolatile capacity :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
               i++;
            Answer[0] = "first";
            Answer[1] = "second";
            Answer[2] = "third";
            Answer[3] = "fourth";
            rand();
            Question[i] = new quiz2("First fit: Allocate the ____ hole that is big enough", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Smallest";
            Answer[1] = "Largest";
            Answer[2] = "Last";
            Answer[3] = "First";
            rand();
            Question[i] = new quiz2("Best-it: Allocate the ____ hole that is big enough (must search the entire list).", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "largest";
            Answer[1] = "smallest";
            Answer[2] = "Last";
            Answer[3] = "First";
            rand();
            
            Question[i] = new quiz2("Worst-fit: Allocate the ______ hole (must search the entire list).", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
             i++;
            Answer[0] = "search the entire list";
            Answer[1] = "search the first list";
            Answer[2] = "search the smallest listt";
            Answer[3] = "list";
            rand();
            Question[i] = new quiz2("Best-it must _____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
           
            i++;
            Answer[0] = "First,Best-fit,worst-fit";
            Answer[1] = "First,worst-fit,Best-fit";
            Answer[2] = "worst-fit,Best-fit,First";
            Answer[3] = "Best-fit,First,N-fit";
            rand();
            Question[i] = new quiz2("____ and _____ are better than _____ in terms of speed and storage utilization", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "All above";
            Answer[1] = "Divide physical memory into frames";
            Answer[2] = "Divide logical memory into pages";
            Answer[3] = "Keep track of all free frames";
            rand();
            Question[i] = new quiz2("WHAT ARE THE MAIN STEPS NEEDED IN PAGING?()", Answer[3], Answer[2], Answer[1], Answer[0], Answer[0],Answer[0]);
            i++;
            Answer[0] = "Any program that is not related to OS";
            Answer[1] = "Adds additional services to the applications";
            Answer[2] = "Comes with the OS";
            Answer[3] = "Any program";
            rand();
            Question[i] = new quiz2("Application program:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Main memory and buffer";
            Answer[1] = "Main memory and catch";
            Answer[2] = "Main memory and Catch";
            Answer[3] = "Main memory and register";
            rand();
            Question[i] = new quiz2("CPU moves data between :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Device controller";
            Answer[1] = "Device driver";
            Answer[2] = "Device switcher";
            Answer[3] = "Device manager";
            rand();
            Question[i] = new quiz2("___ informs CPU the operation is done :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Registers, Program counter";
            Answer[1] = "Address, Program counter";
            Answer[2] = "Catch, Program counter";
            Answer[3] = "Memory, Program counter";
            rand();
            Question[i] = new quiz2("The OS preserve state of the CPU by storing :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Comes with the OS";
            Answer[1] = "Any program";
            Answer[2] = "Adds additional services to the applications";
            Answer[3] = "Any program that is not related to OS";
            rand();
            Question[i] = new quiz2("System program:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Interrupt";
            Answer[1] = "Flag";
            Answer[2] = "Except";
            Answer[3] = "Error";
            rand();
            Question[i] = new quiz2("___ is a Hardware signal passed to the CPU :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Bus";
            Answer[1] = "Catch";
            Answer[2] = "Register";
            Answer[3] = "Thread";
            rand();
            Question[i] = new quiz2("___ is a wire connecting between different controllers :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Interrupt driven";
            Answer[1] = "Switch driven";
            Answer[2] = "CPU driven";
            Answer[3] = "Schadule Driven";
            rand();
            Question[i] = new quiz2("The operating system is :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Adds additional services to the applications";
            Answer[1] = "Any program that is not related to OS";
            Answer[2] = "Comes with the OS";
            Answer[3] = "Any program";
            rand();
            Question[i] = new quiz2("Middleware :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Software generated interrupt";
            Answer[1] = "Hardware generated interrupt";
            Answer[2] = "System generated interrupt";
            Answer[3] = "Middleware generated interrupt";
            rand();
            Question[i] = new quiz2("Trap or an Exception is a ___ :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "System call";
            Answer[1] = "Device-status table";
            Answer[2] = "Interrupter";
            Answer[3] = "Device Requester";
            rand();
            Question[i] = new quiz2("Request to the OS to allow user to wait for I/O completion :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "sequential access";
            Answer[1] = "logical access";
            Answer[2] = "relative access";
            Answer[3] = "direct access";
            rand();
            Question[i] = new quiz2("The simplest file access method is…:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "each user has his/her own user file directory";
            Answer[1] = "the system doesn't its own master file directory";
            Answer[2] = "all of the mentioned";
            Answer[3] = "none of the mentioned";
            rand();
            Question[i] = new quiz2("What will happen in the two level directory structure?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "restrict";
            Answer[1] = "hold";
            Answer[2] = "allow";
            Answer[3] = "all the above";
            rand();
            Question[i] = new quiz2("A tree structure …… the sharing of files and directories:", Answer[2], Answer[0], Answer[1], Answer[3], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Firmware";
            Answer[1] = "Middleware";
            Answer[2] = "Busware";
            Answer[3] = "Systemware";
            rand();
            Question[i] = new quiz2("Typically stored in ROM or EPROM :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Device-status table";
            Answer[1] = "Hardware-status table";
            Answer[2] = "Paging-status table";
            Answer[3] = "OS-status table";
            rand();
            Question[i] = new quiz2("contains an entry for each I/O device. :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Direct Access";
            Answer[1] = "Cache";
            Answer[2] = "Main memory";
            Answer[3] = "Register";
            rand();
            Question[i] = new quiz2("_____ transfers blocks of data to main memory without CPU permission :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Device Driver";
            Answer[1] = "Device Table";
            Answer[2] = "Device controller";
            Answer[3] = "Device Manager";
            rand();
            Question[i] = new quiz2("provides interface between the controller and the kernel :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Cache";
            Answer[1] = "Register";
            Answer[2] = "Main memory";
            Answer[3] = "Primary storage";
            rand();
            Question[i] = new quiz2("Copying information into a faster system :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Main Memory";
            Answer[1] = "Hard-disk";
            Answer[2] = "Nonvolatile memory";
            Answer[3] = "Magnetic-disk";
            rand();
            Question[i] = new quiz2("Large Storage media that the CPU can access directly :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Block";
            Answer[1] = "Byte";
            Answer[2] = "Block and Byte";
            Answer[3] = "Block or Byte";
            rand();
            Question[i] = new quiz2("An interrupt is generated per __ :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "User,Kernel";
            Answer[1] = "System,Kernel";
            Answer[2] = "Privileges,Kernel";
            Answer[3] = "Application, Kernel";
            rand();
            Question[i] = new quiz2("There are two modes :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Infinite loops";
            Answer[1] = "Starvation";
            Answer[2] = "Deadlock";
            Answer[3] = "Starvation and Deadlock";
            rand();
            Question[i] = new quiz2("Timers are needed to prevent :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Interrupt is generated";
            Answer[1] = "Reset Time";
            Answer[2] = "System Shut-Down";
            Answer[3] = "System Crash";
            rand();
            Question[i] = new quiz2("When counter is set to zero :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "passive entity,active entity";
            Answer[1] = "active entity,passive entity";
            Answer[2] = "passive entity, passive entity";
            Answer[3] = "active entity,active entity";
            rand();
            Question[i] = new quiz2("A program is ____, and Process is ____ :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "One program counter";
            Answer[1] = "Passive Threads";
            Answer[2] = "More than one thread";
            Answer[3] = "No program counter";
            rand();
            Question[i] = new quiz2("Single-threaded process has __ :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "All the above";
            Answer[1] = "Process synchronization";
            Answer[2] = "Inter-process communication (IPC)";
            Answer[3] = "Deadlock handling";
            rand();
            Question[i] = new quiz2("Process Management Activitie :", Answer[1], Answer[2], Answer[3], Answer[0], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Memory Management";
            Answer[1] = "OS Manager";
            Answer[2] = "Device Management";
            Answer[3] = "Kernal Management";
            rand();
            Question[i] = new quiz2("___ is responsible of Allocating and deallocation memory :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "All the above";
            Answer[1] = "Public cloud";
            Answer[2] = "Private cloud";
            Answer[3] = "Hybrid cloud";
            rand();
            Question[i] = new quiz2("_____ type of cloud:", Answer[1], Answer[2], Answer[3], Answer[0], Answer[0], Answer[0]);
            i++;
            Answer[0] = "All the above";
            Answer[1] = "Software as a Service (SaaS)";
            Answer[2] = "Platform as a service (Baas)";
            Answer[3] = "Infrastructure as a service (Iaas)";
            rand();
            Question[i] = new quiz2("CLOUD COMPUTING PROVIDE ____ :", Answer[1], Answer[2], Answer[3], Answer[0], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Non preemptive";
            Answer[1] = "Preemptive";
            Answer[2] = "PreProcess";
            Answer[3] = "Long Process";
            rand();
            Question[i] = new quiz2("____ process keeps running until it has finished :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "file system";
            Answer[1] = "entity running";
            Answer[2] = "software running";
            Answer[3] = "process than can invoke a service";
            rand();
            Question[i] = new quiz2("Distributed File System (DFS):", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "One to one";
            Answer[1] = "One to many";
            Answer[2] = "Many to many";
            Answer[3] = "Many to one";
            rand();
            Question[i] = new quiz2("Which threading has more concurrent? :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "it will behave like FIFO";
            Answer[1] = "it will behave like SJF";
            Answer[2] = "it will behave like Priority Scheduling";
            Answer[3] = "it will behave like Normal";
            rand();
            Question[i] = new quiz2("If the Quantum is large in Round Robin, then ___ :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "FCFS";
            Answer[1] = "SJF";
            Answer[2] = "Round Robin";
            Answer[3] = "Priority Scheduling";
            rand();
            Question[i] = new quiz2("____ has Convery effect: short process behind long process :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "amount of time needed to execute a process";
            Answer[1] = "amount of work done per unit time";
            Answer[2] = "amount of time waited by the process in the ready queue";
            Answer[3] = "amount of time between the request and the response of the process";
            rand();
            Question[i] = new quiz2("Turnaround time is ___ :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "All above";
            Answer[1] = "Switching context";
            Answer[2] = "Switching mode";
            Answer[3] = "Jumping to a location to restart program";
            rand();
            Question[i] = new quiz2("Dispatcher tasks :", Answer[1], Answer[2], Answer[3], Answer[0], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Preemptive";
            Answer[1] = "Non preemptive";
            Answer[2] = "PreProcess";
            Answer[3] = "Short Process";
            rand();
            Question[i] = new quiz2("____ process can be kicked from and let another process execute :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "programming environment";
            Answer[1] = "Emulation";
            Answer[2] = "Application containment";
            Answer[3] = "Type 0";
            rand();
            Question[i] = new quiz2("Not really virtualization:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "CPU, I/O";
            Answer[1] = "Code, Cycle";
            Answer[2] = "Cycle, I/O";
            Answer[3] = "Code, I/O";
            rand();
            Question[i] = new quiz2("Burst cycles consist of a cycle of ___ execution and ___ wait :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "The OS";
            Answer[1] = "The PCB";
            Answer[2] = "The Dispatcher";
            Answer[3] = "The Counter";
            rand();
            Question[i] = new quiz2("____ deciding which software thread to run on the logical CPU :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "data inconsistency";
            Answer[1] = "deadlock";
            Answer[2] = "data loss";
            Answer[3] = "bounded waiting";
            rand();
            Question[i] = new quiz2("Concurrent access to data may lead to:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "cooperation of processes";
            Answer[1] = "data inconsistency";
            Answer[2] = "progress";
            Answer[3] = "mutual exclusion";
            rand();
            Question[i] = new quiz2("Maintaining data consistency requires mechanisms to ensure ___:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Critical Section";
            Answer[1] = "Progress";
            Answer[2] = "Mutual Exclusion";
            Answer[3] = "Deadlock Avoidance";
            rand();
            Question[i] = new quiz2("____ :changing values in the memory which may results in data inconsistency or other synchronization problems.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Mutual Exclusion";
            Answer[1] = "Progress";
            Answer[2] = "Bounded Waiting";
            Answer[3] = "Circular Wait";
            rand();
            Question[i] = new quiz2("____ means no other processes can be in their own critical section. :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "removing one of the processes in the waiting queue and placing it in the read queue";
            Answer[1] = "sending an interrupt signal to the OS to start the reading process";
            Answer[2] = "sending an interrupt signal to the OS to remove processes from waiting queue";
            Answer[3] = "sending an interrupt signal to the OS to remove processes from waiting queue and start reading process";
            rand();
            Question[i] = new quiz2("In Semaphore, Wakeup means:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Accessing the same unique data or changed data at the same time";
            Answer[1] = "Only Accessing the same unique data";
            Answer[2] = "Only changing data at the same time";
            Answer[3] = "Doesn't Access nor Change";
            rand();
            Question[i] = new quiz2("forking a process with two identical IDs :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "All above";
            Answer[1] = "Sharing a memory in which there is a turn variable that indicates whose turn is to enter the critical section";
            Answer[2] = "A flag array is used to indicate if a process is ready to enter the critical section";
            Answer[3] = "Two process model";
            rand();
            Question[i] = new quiz2("Peterson’s Solution main activity :", Answer[1], Answer[2], Answer[3], Answer[0], Answer[0], Answer[0]);
            i++;
            Answer[1] = "True";
            Answer[0] = "False";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("Progress in Mutual Exclusion means not postponing a critical section execution if no other processes are in their critical section :", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], "[False] in (Critical Section)");
            i++;
            Answer[0] = "A and B";
            Answer[1] = "Test and Set Instruction";
            Answer[2] = "Compare and Swap Instruction";
            Answer[3] = "Test(), Set()";
            rand();
            Question[i] = new quiz2("Hard-ware Special instructions that allow to test and modify content of a word atomically :", Answer[1], Answer[2], Answer[3], Answer[0], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Atomic";
            Answer[1] = "Mutex";
            Answer[2] = "Peterson's";
            Answer[3] = "Busy Waiting";
            rand();
            Question[i] = new quiz2("Uninterruptible update on basic data types (int and Booleans) :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Bounded Waiting";
            Answer[1] = "Mutual Exclusion";
            Answer[2] = "Progress";
            Answer[3] = "Circular Wait";
            rand();
            Question[i] = new quiz2("_____ means a limiting specific process entered their critical section while other processes waiting for their critical section to be executed", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "All the above";
            Answer[1] = "Each semaphore has an associated waiting queue";
            Answer[2] = "Each entry has a value";
            Answer[3] = "Each entry has a pointer to the next record";
            rand();
            Question[i] = new quiz2("Semaphore Implementation :", Answer[1], Answer[2], Answer[3], Answer[0], Answer[0], Answer[0]);
            i++;
            Answer[0] = "quantum, preempted";
            Answer[1] = "preempted, quantum";
            Answer[2] = "Key, ready";
            Answer[3] = "Key, quantum";
            rand();
            Question[i] = new quiz2("In Round Robin; Each process gets a ___, then the process is _____ and added to the ready queue:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "large, FIFO";
            Answer[1] = "small, FIFO";
            Answer[2] = "low priority, FIFO";
            Answer[3] = "Hihg Priority, FCFS";
            rand();
            Question[i] = new quiz2("In Round Robin;If the Quantum is ____, then it will behave like ____ :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "True";
            Answer[1] = "False";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("Dining Philosophers Problem is solved on system by providing reader-writer locks:", Answer[0], Answer[1], Answer[2], Answer[3], Answer[1], "(R/W Problem is solved ...)");
            i++;
            Answer[0] = "True";
            Answer[1] = "False";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("In Round Robin; If the Quantum is small, it will result in a lot of context switches and the overhead will be too high:", Answer[0], Answer[1], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Aging";
            Answer[1] = "Banker's Algorithm";
            Answer[2] = "Metux";
            Answer[3] = "Graph Algorithm";
            rand();
            Question[i] = new quiz2("The starvation can be solved using ___ :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Rw_mutex initialized to 1, Mutex initialized to 1, Read_count initialized to 0";
            Answer[1] = "Rw_mutex initialized to 0, Mutex initialized to 1, Read_count initialized to 1";
            Answer[2] = "Rw_mutex initialized to 0, Mutex initialized to 1, Read_count initialized to 0";
            Answer[3] = "Rw_mutex initialized to 1, Mutex initialized to 0, Read_count initialized to 1";
            rand();
            Question[i] = new quiz2("To solve R/W problem ___ :", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "All above";
            Answer[1] = "Bounded-Buffer";
            Answer[2] = "Readers and Writers";
            Answer[3] = "Dining-Philosophers";
            rand();
            Question[i] = new quiz2("Synchronization Classical Problem ___ :", Answer[1], Answer[2], Answer[3], Answer[0], Answer[0], Answer[0]);
            i++;
            Answer[0] = "True";
            Answer[1] = "False";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("Once a writer is ready to write, no newly arrived readers is allowed to read:", Answer[0], Answer[1], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Threat";
            Answer[1] = "Attack";
            Answer[2] = "replay attack";
            Answer[3] = "spyware";
            rand();
            Question[i] = new quiz2("............: potential security violation.:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Attack";
            Answer[1] = "threat";
            Answer[2] = "Session hijacking";
            Answer[3] = "Ransomware";
            rand();
            Question[i] = new quiz2("...............: is attempt to breach security:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Torjan horse";
            Answer[1] = "Ransomware";
            Answer[2] = "Trap door";
            Answer[3] = "Graping hook";
            rand();
            Question[i] = new quiz2("...............: Code segment that misuses its environment:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "capability";
            Answer[1] = "capability list";
            Answer[2] = "Access matrix";
            Answer[3] = "domain switch";
            rand();
            Question[i] = new quiz2("Object represented by its name or address, called a :..................:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "protection domain";
            Answer[1] = "domain Switch";
            Answer[2] = "Accsess matrix";
            Answer[3] = "Capability";
            rand();
            Question[i] = new quiz2("Implementation can be via process operating in a:...............:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Live migration";
            Answer[1] = "Templating";
            Answer[2] = "hypercall";
            Answer[3] = "cloud computing";
            rand();
            Question[i] = new quiz2(".................: move a running VM from one host to another", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "hypercall";
            Answer[1] = "bridge";
            Answer[2] = "overcommitment";
            Answer[3] = "Reliability";
            rand();
            Question[i] = new quiz2("..............: call to hypervisor when page-table changes needed", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Reliable";
            Answer[1] = "quicker data access";
            Answer[2] = "can make work station diskless";
            Answer[3] = "single machine for server and users";
            rand();
            Question[i] = new quiz2("All advantages of main memory CACHES except:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "virtual address space";
            Answer[1] = "virtual memory";
            Answer[2] = "demand paging";
            Answer[3] = "demand segmentation";
            rand();
            Question[i] = new quiz2("Logical view of how process is stored in memory ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "size";
            Answer[1] = "character";
            Answer[2] = "binary";
            Answer[3] = "numeric";
            rand();
            Question[i] = new quiz2("Which of the following file attribute ?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "execution time";
            Answer[1] = "assembly time";
            Answer[2] = "load time";
            Answer[3] = "interrupt time";
            rand();
            Question[i] = new quiz2("The ___ binding scheme facilitates swapping. ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "compile-time binding";
            Answer[1] = "load-time binding";
            Answer[2] = "execution-time binding";
            Answer[3] = "interrupt binding";
            rand();
            Question[i] = new quiz2("Absolute code can be generated for __. ?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Delete";
            Answer[1] = "Update";
            Answer[2] = "Accesse";
            Answer[3] = "Rollup";
            rand();
            Question[i] = new quiz2("TYPE OF ACCESSES?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "spinlocking-thread";
            Answer[1] = "chopsticks";
            Answer[2] = "waiting queue";
            Answer[3] = "Multithread";
            rand();
            Question[i] = new quiz2("In Kernel Synchronization multiprocessor system _____ is used", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "waiting queue";
            Answer[1] = "counter";
            Answer[2] = "timer";
            Answer[3] = "program counter";
            rand();
            Question[i] = new quiz2("Each semaphore has an associated ____", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Kernel Synchronization";
            Answer[1] = "Dining Philosophers";
            Answer[2] = "Readers and Writers";
            Answer[3] = "Semaphore";
            rand();
            Question[i] = new quiz2("____ Provides dispatcher objects which may act as mutexes, semaphores, events, timers", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "A and B";
            Answer[1] = "Circular wait,No preemption";
            Answer[2] = "Mutual Exclusion,Hold and Wait";
            Answer[3] = "Non of the above";
            rand();
            Question[i] = new quiz2("WHAT ARE THE CONDITIONS THAT MAKES DEADLOCK ARISE:", Answer[1], Answer[2], Answer[3], Answer[0], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Request Edge, Assignment Edge";
            Answer[1] = "Edge, Assigment";
            Answer[2] = "Request, release";
            Answer[3] = "Hold, wait";
            rand();
            Question[i] = new quiz2("Resource Allocation Graph has ____ and ____", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Mutual Exclusion";
            Answer[1] = "Hold and Wait";
            Answer[2] = "No preemption";
            Answer[3] = "Circular wait";
            rand();
            Question[i] = new quiz2("only one process can use a resource at a time", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "True";
            Answer[1] = "False";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("If only instance per resource type, deadlock, and If several instances, possibility of a deadlock", Answer[0], Answer[1], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
            Answer[2] = "Mutual Exclusion";
            Answer[1] = "Hold and Wait";
            Answer[0] = "No preemption";
            Answer[3] = "Circular wait";
            rand();
            Question[i] = new quiz2("Resources can only be released voluntarily.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Deadlock prevention and Deadlock avoidance";
            Answer[1] = "Deadlock avoidance";
            Answer[2] = "Deadlock prevention";
            Answer[3] = "Deadlock blocker";
            rand();
            Question[i] = new quiz2("To Ensure the system will never enter a deadlock state we use ___ and ___:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "Mutual Exclusion";
            Answer[1] = "Hold and Wait";
            Answer[2] = "No preemption";
            Answer[0] = "Circular wait";
            rand();
            Question[i] = new quiz2("P0 waiting for P1, P1 waiting for P2, P2 waiting for P0", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "True";
            Answer[1] = "False";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("Deadlock handling; Allow the system to enter a deadlock state and then recover ", Answer[0], Answer[1], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
            Answer[0] = "False";
            Answer[1] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("never Ignore the problem or pretend that deadlocks never occur in the system", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
            Answer[1] = "Mutual Exclusion";
            Answer[0] = "Hold and Wait";
            Answer[2] = "No preemption";
            Answer[3] = "Circular wait";
            rand();
            Question[i] = new quiz2("A process holding a resource waiting to acquire additional resources held by another process.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "No preemption";
            Answer[1] = "Hold and Wait";
            Answer[2] = "Mutual Exclusion";
            Answer[3] = "Circular wait";
            rand();
            Question[i] = new quiz2("One of the following might cause starvation", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Main memory, registers";
            Answer[1] = "Main memory, catch";
            Answer[2] = "Main memory, DAM";
            Answer[3] = "Main memory, DROM";
            rand();
            Question[i] = new quiz2("___ and ___ are the only storage CPU can directly access", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "one";
            Answer[1] = "three";
            Answer[2] = "five";
            Answer[3] = "nine";
            rand();
            Question[i] = new quiz2("• Register Access is done in ____ CPU clock.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "main memory and CPU registers";
            Answer[1] = "main memory and buffer";
            Answer[2] = "main memory and device controller";
            Answer[3] = "main memory and the operating system";
            rand();
            Question[i] = new quiz2("Cache is between ____ and ____", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "stall";
            Answer[1] = "infinite loop";
            Answer[2] = "system loop";
            Answer[3] = "Hold and wait";
            rand();
            Question[i] = new quiz2("main memory can take many cycles which causes a _____", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "mirroring";
            Answer[1] = "shadowing";
            Answer[2] = "redundancy";
            Answer[3] = "all of the mentioned";
            rand();
            Question[i] = new quiz2("The technique of duplicating every disk is known as ……..:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "allows the sharing of subdirectories and files";
            Answer[1] = "does not allow the sharing of files";
            Answer[2] = "Is less complicated than a simple tree-structured directory structure";
            Answer[3] = "Is less flex than a simple tree-structured directory structure";
            rand();
            Question[i] = new quiz2("An acyclic-graph directory structure ....... ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "All of the above.";
            Answer[1] = "Programs can be written to use more memory than is available in physical memory.";
            Answer[2] = "Less I/O is needed to load or swap each user program into memory.";
            Answer[3] = "CPU utilization and throughput is increased.";
            rand();
            Question[i] = new quiz2("Which of the following is a benefit of allowing a program to be partially in memory for execution?", Answer[1], Answer[2], Answer[3], Answer[0], Answer[0], Answer[0]);
            i++;
            Answer[3] = "virtual memory is separated from logical memory.";
            Answer[1] = "virtual memory is separated from physical memory.";
            Answer[2] = "physical memory is separated from secondary storage.";
            Answer[0] = "physical memory is separated from logical memory.";
            rand();
            Question[i] = new quiz2("In systems that support virtual memory, ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "allows the child process to use the address space of the parent";
            Answer[1] = "uses copy-on-write with the fork() call";
            Answer[2] = "is not intended to be used when the child process calls exec() immediately after creation";
            Answer[3] = "duplicates all pages that are modified by the child process";
            rand();
            Question[i] = new quiz2("The vfork() system call in UNIX ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "8";
            Answer[1] = "14";
            Answer[2] = "13";
            Answer[3] = "10";
            rand();
            Question[i] = new quiz2("1 2 3 4 2 3 4 1 2 1 1 3 1 4 , three frames within our system: Using FIFO. What is the Number of page faults.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "3, 4, 2";
            Answer[1] = "4, 1, 3";
            Answer[2] = "4, 2, 3";
            Answer[3] = "3, 1, 4";
            rand();
            Question[i] = new quiz2("1 2 3 4 2 3 4 1 2 1 1 3 1 4. three frames: Using the FIFO, what is the final configuration of the three frames", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
             Answer[0] = "False";
            Answer[1] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("Windows uses both a local and global page replacement policy.", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
             Answer[0] = "False";
            Answer[1] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("If the page-fault rate is too high, the process may have too many frames.", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
             Answer[1] = "False";
            Answer[0] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("The buddy system for allocating kernel memory is very likely to cause fragmentation within the allocated segments. ", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
             Answer[0] = "False";
            Answer[1] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("In Linux, a slab may only be either full or empty.", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
             Answer[0] = "False";
            Answer[1] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("Non-uniform memory access has little effect on the performance of a virtual memory system.", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
             Answer[1] = "False";
            Answer[0] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("A page fault must be preceded by a TLB miss.", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
             Answer[0] = "False";
            Answer[1] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("Only a fraction of a process's working set needs to be stored in the TLB.", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
             Answer[1] = "False";
            Answer[0] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("Stack algorithms can never exhibit Belady's anomaly. ", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
             Answer[0] = "False";
            Answer[1] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("On systems that provide it, vfork() should always be used instead of fork().", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
             Answer[0] = "False";
            Answer[1] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("Solaris uses both a local and global page replacement policy.", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
            Answer[0] = "O(n^2)";
            Answer[1] = "O(n )";
            Answer[2] = "O(m x n^2)";
            Answer[3] = "O(1)";

            rand();
            Question[i] = new quiz2("In deadlock with signal instance resources, Detection algorithm to detect a cycle in a graph requires an order of ....... operations, where n is the number of vertices in the graph", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Virtual Memory";
            Answer[1] = "CPU";
            Answer[2] = "Physical memory";
            Answer[3] = "Main Memory";

            rand();
            Question[i] = new quiz2("....... Only part of the program needs to be in memory for execution", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Demand paging and Demand segmentation";
            Answer[1] = "Page-table length register (PTLR)";
            Answer[2] = "Page-table base register (PTBR)";
            Answer[3] = "Demand paging and multi-threading";

            rand();
            Question[i] = new quiz2("Virtual memory can be implemented via:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Virtual address space";
            Answer[1] = "physical Adress space";
            Answer[2] = "CPU";
            Answer[3] = "Main Memory";

            rand();
            Question[i] = new quiz2(".......... – logical view of how process is stored in memory", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "O(m x n^2)";
            Answer[1] = "O(n^2)";
            Answer[2] = "O(n)";
            Answer[3] = "O(1)";

            rand();
            Question[i] = new quiz2("In deadlock with several instances resources, Detection Algorithm requires an order of ........operations to detect whether the system is in deadlocked state", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Dirty";
            Answer[1] = "Reference";
            Answer[2] = "Invalid";
            Answer[3] = "Valid";

            rand();
            Question[i] = new quiz2("The _____ bit is used to reduce overhead of page transfers; only modified pages are written to the disk.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
                        Answer[0] = "Memory-mapped I/O";
            Answer[1] = "Controlled-mapped I/O";
            Answer[2] = "Interrupt-mapped I/O";
            Answer[3] = "Bus-mapped I/O";

            rand();
            Question[i] = new quiz2("When hardware is accessed by reading and writing to the specific memory locations, then it is called ______.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
                        Answer[0] = "FCFS";
            Answer[1] = "SCAN";
            Answer[2] = "SSTF";
            Answer[3] = "LOOK";

            rand();
            Question[i] = new quiz2("Which of the following disk head scheduling algorithms does not take into account the current position of the disk head?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
                        Answer[0] = "Hash table";
            Answer[1] = "Linked";
            Answer[2] = "Indexed";
            Answer[3] = "Non-linear";

            rand();
            Question[i] = new quiz2("Which of the following is a directory implementation?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
                        Answer[0] = "Segmentation";
            Answer[1] = "Pure demand paging";
            Answer[2] = "Paging";
            Answer[3] = "Swapping";

            rand();
            Question[i] = new quiz2("Which of the following memory allocation scheme suffers from External fragmentation?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
                        Answer[0] = "page table base register";
            Answer[1] = "page register";
            Answer[2] = "stack pointer";
            Answer[3] = "program counter";

            rand();
            Question[i] = new quiz2("The address of a page table in memory is pointed by ___", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
                        Answer[0] = "Memory management unit";
            Answer[1] = "PCI";
            Answer[2] = "CPU";
            Answer[3] = "Swapping";

            rand();
            Question[i] = new quiz2("Run time mapping from virtual to physical address is done by _____", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "contiguous allocation";
            Answer[1] = "linked allocation";
            Answer[2] = "indexed allocation";
            Answer[3] = "hashed allocation";

            rand();
            Question[i] = new quiz2("To solve the problem of external fragmentation ……needs to be done periodically.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "equal";
            Answer[1] = "global";
            Answer[0] = "proportional";
            Answer[3] = "slab";

            rand();
            Question[i] = new quiz2("Optimal page replacement ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "TLB cache";
            Answer[1] = "page resolution";
            Answer[0] = "TLB reach";
            Answer[3] = "hit ratio";

            rand();
            Question[i] = new quiz2("The ____ is the number of entries in the TLB multiplied by the page size.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "FIFO";
            Answer[1] = "Least frequently used";
            Answer[2] = "Most frequently used";
            Answer[0] = "LRU";

            rand();
            Question[i] = new quiz2("_____ is the algorithm implemented on most systems.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "Thrashing";
            Answer[1] = "Memory-mapping";
            Answer[2] = "Demand paging";
            Answer[3] = "Swapping";

            rand();
            Question[i] = new quiz2("_____ occurs when a process spends more time paging than executing.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "when a process exceeds its working set minimum";
            Answer[0] = "when a process exceeds its working set maximum";
            Answer[2] = "when the system undergoes automatic working set trimming";
            Answer[3] = "under all circumstances";

            rand();
            Question[i] = new quiz2("Windows uses a local page replacement policy ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "The speed at which pages are examined (the scanrate) is constant.";
            Answer[1] = "The pageout process only runs if the number of free pages is less than lotsfree.";
            Answer[2] = "An LRU approximation algorithm is employed.";
            Answer[3] = "Pages selected for replacement may be reclaimed before being placed on the free list.";

            rand();
            Question[i] = new quiz2("Which of the following statements is false with regard to Solaris memory management?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "39 KB";
            Answer[1] = "42 KB";
            Answer[0] = "64 KB";
            Answer[3] = "None of the above";

            rand();
            Question[i] = new quiz2("What size segment will be allocated for a 39 KB request on a system using the Buddy system for kernel memory allocation?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Memory-mapping";
            Answer[1] = "Shared memory";
            Answer[2] = "Slab allocation";
            Answer[3] = "Locality of reference";

            rand();
            Question[i] = new quiz2("______ allows a portion of a virtual address space to be logically associated with a file.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "memory-mapped I/O";
            Answer[1] = "demand-paged memory";
            Answer[0] = "non-uniform memory access";
            Answer[3] = "copy-on-write memory";

            rand();
            Question[i] = new quiz2("Systems in which memory access times vary significantly are known as __________", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "Memory is allocated using a simple power-of-2 allocator";

            Answer[1] = "It allows kernel code and data to be efficiently paged";
            Answer[2] = "It allows larger segments to be combined using coalescing";

            Answer[0] = "There is no memory fragmentation";
            rand();
            Question[i] = new quiz2("Which of the following is considered a benefit when using the slab allocator?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "text";
            Answer[0] = "source";
            Answer[2] = "object";
            Answer[3] = "executable";

            rand();
            Question[i] = new quiz2("A(n) ____ file is a sequence of functions.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[2] = "text";
            Answer[1] = "source";
            Answer[0] = "object";
            Answer[3] = "executable";

            rand();
            Question[i] = new quiz2("A(n) ____ file is a sequence of bytes organized into blocks understandable by the system's linker.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "text";
            Answer[1] = "source";
            Answer[2] = "object";
            Answer[0] = "executable";

            rand();
            Question[i] = new quiz2("A(n) ____ file is a series of code sections that the loader can bring into memory and execute.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[2] = "behaves like a writer lock";
            Answer[1] = "ensures that a file can have only a single concurrent shared lock";
            Answer[0] = "behaves like a reader lock";
            Answer[3] = "will prevent all other processes from accessing the locked file";

            rand();
            Question[i] = new quiz2("A shared lock ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "behaves like a writer lock";
            Answer[1] = "ensures that a file can have only a single concurrent shared lock";
            Answer[2] = "behaves like a reader lock";
            Answer[3] = "will prevent all other processes from accessing the locked file";
            rand();
            Question[i] = new quiz2("An exclusive lock ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "sequential access";
            Answer[1] = "logical access";
            Answer[2] = "relative access";
            Answer[3] = "direct access";

            rand();
            Question[i] = new quiz2("The simplest file access method is ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[3] = "file extension";
            Answer[1] = "creator name";
            Answer[2] = "hint";
            Answer[0] = "magic number";

            rand();
            Question[i] = new quiz2("A _____ is used on UNIX systems at the beginning of some files to roughly indicate the type of the file.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[2] = "It is the most common mode of access.";

            Answer[0] = "It allows programs to read and write records in no particular order.";
            Answer[1] = "Files are made up of variable-length records.";

            Answer[3] = "It is not a good method for accessing large amounts of data quickly.";

            rand();
            Question[i] = new quiz2("Which of the following is true of the direct-access method?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "Users cannot create their own subdirectories";

            Answer[1] = "Users cannot acquire permission to access the files of other users";
            Answer[2] = "Directories can share subdirectories and files";

            Answer[3] = "It is the most common directory structure";

            rand();
            Question[i] = new quiz2("Which of the following is true of the tree-structured directory structure?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[1] = "does not allow the sharing of files";

            Answer[0] = "allows the sharing of subdirectories and files";
            Answer[2] = "is less complicated than a simple tree-structured directory structure";

            Answer[3] = "is less flexible than a simple tree-structured directory structure";

            rand();
            Question[i] = new quiz2("An acyclic-graph directory structure ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "a relative path name";
            Answer[0] = "an absolute path name";
            Answer[2] = "a relative path name to the current directory of /home";
            Answer[3] = "an invalid path name";
            rand();
            Question[i] = new quiz2("The path name /home/people/os-student/chap10.txt is an example of", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "The file name may not be reused.";

            Answer[1] = "The contents of the file may be altered.";
            Answer[2] = "It is difficult to implement in a distributed system.";

            Answer[3] = "The file name may be reused.";

            rand();
            Question[i] = new quiz2("Which of the following is a key property of an immutable file?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "owner";
            Answer[0] = "current user";
            Answer[2] = "group";
            Answer[3] = "universe";

            rand();
            Question[i] = new quiz2("Which of the following is not considered a classification of users in connection with each file?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Lightweight directory-access protocol (LDAP)";

            Answer[1] = "Domain name system (DNS)";
            Answer[2] = "Common internet file system (CIFS)";

            Answer[3] = "Network information service (NIS)";

            rand();
            Question[i] = new quiz2("______ is a secure, distributed naming mechanism.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Reliability";
            Answer[1] = "Multiple users";
            Answer[2] = "Consistency semantics";
            Answer[3] = "Remote access";

            rand();
            Question[i] = new quiz2(". ________ is/are not considered a difficulty when considering file sharing.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "a relative path name";
            Answer[1] = "an absolute path name";
            Answer[2] = "a relative path name to the current directory of /os-student";
            Answer[3] = "an invalid path name";

            rand();
            Question[i] = new quiz2("The path name os-student/src/vm.c is an example of;", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "A remote file system may be mounted.";

            Answer[1] = "The client-server relationship is not very common with networked machines.";
            Answer[2] = "A client may only use a single server.";

            Answer[3] = "The client and server agree on which resources will be made available by servers.";

            rand();
            Question[i] = new quiz2("Which of the following statements regarding the client-server model is true?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "tree data structure";
            Answer[0] = "linear list";
            Answer[2] = "hash table";
            Answer[3] = "nonlinear list";

            rand();
            Question[i] = new quiz2("Which of the following is the simplest method for implementing a directory?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "inode";
            Answer[1] = "file";
            Answer[2] = "superblock";
            Answer[3] = "dentry";

            rand();
            Question[i] = new quiz2("In the Linux VFS architecture, a(n) ____ object represents an individual file.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[1] = "To traverse the list, each block must be read on the disk.";

            Answer[0] = "It is not feasible to keep the entire list in main memory for large disks.";
            Answer[2] = "The technique is more complicated than most other techniques.";

            Answer[3] = "This technique is not feasible for small disks.";

            rand();
            Question[i] = new quiz2("The free-space list can be implemented using a bit vector approach. Which of the following is a drawback of this technique?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[1] = "uses virtual memory techniques to cache file data as system-oriented blocks as opposed to pages";
            Answer[0] = "uses virtual memory techniques to cache file data as pages as opposed to system-oriented blocks.";
            Answer[2] = "is used in Windows NT but not in Windows 2000.";

            Answer[3] = "cannot be used to cache both process pages and file data.";

            rand();
            Question[i] = new quiz2("Page caching ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "independent machines with independent file systems";
            Answer[1] = "dependent machines with independent file systems";
            Answer[2] = "dependent machines with dependent file systems";
            Answer[3] = "independent machines with dependent file systems";

            rand();
            Question[i] = new quiz2("NFS views a set of interconnected workstations as a set of ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "0011101110111110";
            Answer[0] = "1100010001000001";
            Answer[2] = "0100010001000001";
            Answer[3] = "1100010001000000";

            rand();
            Question[i] = new quiz2("A disk with free blocks 0,1,5,9,15 would be represented with what bit map?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "Metadata";
            Answer[1] = "Logical file system";
            Answer[2] = "Basic file system";
            Answer[3] = "File-organization module";

            rand();
            Question[i] = new quiz2("______ includes all of the file system structure, minus the actual contents of files.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "1";
            Answer[0] = "6";
            Answer[2] = "7";
            Answer[3] = "5";

            rand();
            Question[i] = new quiz2("How many disk accesses are necessary for direct access to byte 20680 using linked allocation and assuming each disk block is KB in size?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "extent";
            Answer[1] = "disk block group";
            Answer[2] = "inode";
            Answer[3] = "file-allocation table (FAT)";

            rand();
            Question[i] = new quiz2("A contiguous chunk of disk blocks is known as a(n) _____", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[1] = "superblock";
            Answer[0] = "inode";
            Answer[2] = "file-control block (FC";
            Answer[1] = "nna";

            Answer[3] = "master file table";

            rand();
            Question[i] = new quiz2("On UNIX systems, the data structure for maintaining information about a file is a(n) _____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "least-recently-used (LRU)";

            Answer[1] = "first-in-first-out (FIFO)";
            Answer[2] = "most-recently-used";
            Answer[3] = "least-frequently-used (LFU)";
            rand();
            Question[i] = new quiz2("Which algorithm is considered reasonable for managing a buffer cache?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[1] = "Only aborted transactions must be completed.";

            Answer[0] = "All transactions in the log must be completed.";
            Answer[2] = "All transactions in the log must be marked as invalid.";

            Answer[3] = "File consistency checking must be performed.";

            rand();
            Question[i] = new quiz2("Consider a system crash on a log-structured file system. Which one of the following events must occur?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "services the request with the maximum seek time";
            Answer[0] = "services the request with the minimum seek time";
            Answer[2] = "chooses to service the request furthest from the current head position";
            Answer[3] = "None of the above";

            rand();
            Question[i] = new quiz2("The SSTF scheduling algorithm ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[1] = "is a high-level operating system task";
            Answer[0] = "tries to provide the best throughput for the virtual memory system";
            Answer[2] = "is primarily used to increase the reliability of data in a system";
            Answer[3] = "None of the above";

            rand();
            Question[i] = new quiz2("Swap space management ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[1] = "is a high-level operating system task";
            Answer[0] = "tries to provide the best throughput for the virtual memory system";
            Answer[2] = "is primarily used to increase the reliability of data in a system";
            Answer[3] = "None of the above";

            rand();
            Question[i] = new quiz2("Swap space management ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "is primarily used for security reasons";
            Answer[0] = "is primarily used to ensure higher data reliability";
            Answer[2] = "stands for redundant arrays of inexpensive disks";
            Answer[3] = "is primarily used to decrease the dependence on disk drives";

            rand();
            Question[i] = new quiz2("A RAID structure ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "FCFS";
            Answer[1] = "SSTF";
            Answer[2] = "SCAN";
            Answer[3] = "LOOK";

            rand();
            Question[i] = new quiz2("Which of the following disk head scheduling algorithms does not take into account the current position of the disk head?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "boot block";
            Answer[0] = "master boot record (MBR)";
            Answer[2] = "boot partition";
            Answer[3] = "boot disk";

            rand();
            Question[i] = new quiz2("The location where Windows places its boot code is the _____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "seek time + rotational latency";
            Answer[1] = "transfer time + transfer rate";
            Answer[2] = "effective transfer rate - transfer rate";
            Answer[3] = "cylinder positioning time + disk arm positioning time";

            rand();
            Question[i] = new quiz2("What are the two components of positioning time?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Sector slipping";
            Answer[1] = "Sector sparing";
            Answer[2] = "Bad block mapping";
            Answer[3] = "Hard error management";

            rand();
            Question[i] = new quiz2("_____ is a technique for managing bad blocks that maps a bad sector to a spare sector.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "They generally consume more power than traditional hard disks.";

            Answer[1] = "They have the same characteristics as magnetic hard disks, but can be more reliable.";
            Answer[2] = "They are generally more expensive per megabyte than traditional hard disks.";

            Answer[3] = "They have no seek time or latency.";

            rand();
            Question[i] = new quiz2("Which of the following statements regarding solid state disks (SSDs) is false?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "status";
            Answer[1] = "control";
            Answer[2] = "data-in";
            Answer[3] = "transfer";

            rand();
            Question[i] = new quiz2("The ____ register of an I/O port can be written by the host to start a command or to change the mode of a device.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "transfers data in blocks of bytes";
            Answer[0] = "transfers data a byte at a time";
            Answer[2] = "is a device such as a disk drive";
            Answer[3] = "is similar to a random access device";

            rand();
            Question[i] = new quiz2("A character-stream device ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "Raw";
            Answer[1] = "Stream";
            Answer[2] = "Indirect";
            Answer[3] = "Cooked";

            rand();
            Question[i] = new quiz2("____ I/O accesses a block device as a simple array of blocks.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "terminal concentrator";
            Answer[1] = "network daemon";
            Answer[2] = "I/O channel";
            Answer[3] = "context switch coordinator";

            rand();
            Question[i] = new quiz2("A(n) ____ is a front-end processor that multiplexes the traffic from hundreds of remote terminals into one port on a large computer.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "user";
            Answer[1] = "process";
            Answer[2] = "procedure";
            Answer[3] = "task";

            rand();
            Question[i] = new quiz2("In the UNIX operating system, a domain is associated with the ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "global table";
            Answer[1] = "access list for objects";
            Answer[2] = "lock-key mechanism";
            Answer[3] = "capability list";

            rand();
            Question[i] = new quiz2("The ____ implementation of an access table consists of sets of ordered triples.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[1] = "gate";
            Answer[0] = "tag";
            Answer[2] = "key";
            Answer[3] = "lock";

            rand();
            Question[i] = new quiz2("In capability lists, each object has a ____ to denote its type.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "When a class is loaded, the JVM assigns the class to a protection domain that gives the permissions of that class.";

            Answer[1] = "It does not support the dynamic loading of untrusted classes over a network.";
            Answer[2] = "It does not support the execution of mutually distrusting classes within the same JVM.";

            Answer[3] = "Methods in the calling sequence are not responsible for requests to access a protected resource.";

            rand();
            Question[i] = new quiz2("Which of the following is true of the Java programming language in relation to protection?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "masquerading";
            Answer[1] = "message modification";
            Answer[2] = "session hijacking";
            Answer[3] = "phishing";

            rand();
            Question[i] = new quiz2("The most common method used by attackers to breach security is ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[1] = "the user specifies two passwords";
            Answer[0] = "the computer supplies one part of a password and the user enters the other part";
            Answer[2] = "passwords must contain equal amounts of numbers and digits paired together";
            Answer[3] = "two users must enter their own separate password to gain access to the system";

            rand();
            Question[i] = new quiz2("In a paired-password system, ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "polymorphic";
            Answer[1] = "tunneling";
            Answer[2] = "multipartite";
            Answer[3] = "stealth";

            rand();
            Question[i] = new quiz2("A ____ virus changes each time it is installed to avoid detection by antivirus software.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[1] = "key ring";
            Answer[0] = "digital certificate";
            Answer[2] = "message digest";
            Answer[3] = "digital key";

            rand();
            Question[i] = new quiz2("A ____ is a public key digitally signed by a trusted party.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[0] = "Network";
            Answer[1] = "Transport";
            Answer[2] = "Data-link";
            Answer[3] = "Application";

            rand();
            Question[i] = new quiz2("____ layer security generally has been standardized on IPSec.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "byte at a time";
            Answer[1] = "file at a time";
            Answer[0] = "block at a time";
            Answer[3] = "sector at a time";

            rand();
            Question[i] = new quiz2("Transfers between memory and disk are performed a ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "Name";
            Answer[1] = "Size";
            Answer[0] = "Resolution";
            Answer[3] = "Protection";

            rand();
            Question[i] = new quiz2("Which of the following is not considered a file attribute?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "batch file";
            Answer[1] = "object file";
            Answer[0] = "executable file";
            Answer[3] = "text file";

            rand();
            Question[i] = new quiz2("app.exe is an example of a(n) _____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "does not allow a remote directory to be accessible in a transparent manner";
            Answer[1] = "exhibits a transitivity property in terms of client access to other file systems";
            Answer[0] = "establishes the initial logical connection between a server and a client";
            Answer[3] = "provides a set of RFCs for remote file operations";

            rand();
            Question[i] = new quiz2("Ans: A0. The NFS mount protocol ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "contiguous allocation";
            Answer[1] = "indexed allocation";
            Answer[0] = "linked allocation";
            Answer[3] = "multilevel index";

            rand();
            Question[i] = new quiz2("The file-allocation table (FAT) used in MS-DOS is an example of _____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "sectors";
            Answer[1] = "arms";
            Answer[0] = "tracks";
            Answer[3] = "cylinders";

            rand();
            Question[i] = new quiz2("The surface of a magnetic disk platter is divided into ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "a special purpose storage system that is accessed remotely over a data network";
            Answer[1] = "not suitable for hard disks";
            Answer[0] = "accessed via local I/O ports";
            Answer[3] = "not suitable for use in raid arrays";

            rand();
            Question[i] = new quiz2("Host-attached storage is ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "host-attached storage";
            Answer[1] = "network-attached storage";
            Answer[0] = "storage-area network";
            Answer[3] = "private-area network";

            rand();
            Question[i] = new quiz2("A _____ is a private network connecting servers and storage units.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "SSTF";
            Answer[1] = "SCAN";
            Answer[0] = "FCFS";
            Answer[3] = "LOOK";

            rand();
            Question[i] = new quiz2("Solid state disks (SSDs) commonly use the ___________ disk scheduling policy.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "do not utilize an additional, special purpose, processor";
            Answer[1] = "are a nonstandard component in PCs of today";
            Answer[0] = "can steal memory access cycles from the main CPU";
            Answer[3] = "can access main memory at the same time as the main CPU";

            rand();
            Question[i] = new quiz2("DMA controllers ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "Increase the number of context switches.";

            Answer[1] = "Use small data transfers";
            Answer[0] = "Move processing primitives into hardware";
            Answer[3] = "Decrease concurrency using DMA controllers";

            rand();
            Question[i] = new quiz2("Which of the following is a principle that can improve the efficiency of I/O?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "star structure";
            Answer[1] = "linear structure";
            Answer[0] = "ring structure";
            Answer[3] = "directory structure";

            rand();
            Question[i] = new quiz2("In MULTICS, the protection domains are organized in a _____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "owner";
            Answer[1] = "copy";
            Answer[0] = "control.";

            Answer[3] = "switch";

            rand();
            Question[i] = new quiz2("In an access matrix, the ____ right allows a process to change the entries in a row.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[2] = "aimed at gaining information";
            Answer[1] = "aimed at stealing resources";
            Answer[0] = "aimed at disrupting legitimate use of a system";
            Answer[3] = "generally not network based";

            rand();
            Question[i] = new quiz2("A denial of service attack is ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[2] = "DES";
            Answer[1] = "AES";
            Answer[0] = "RC4";
            Answer[3] = "twofish";

            rand();
            Question[i] = new quiz2("____ is a symmetric stream cipher.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[2] = "It provides security at the data-link layer.";

            Answer[1] = "It is a simple protocol with limited options.";
            Answer[0] = "It is commonly used for secure communication on the Internet.";

            Answer[3] = "It was designed by Microsoft.";

            rand();
            Question[i] = new quiz2("Which of the following is true of SSL?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[3] = "Writes to an open file by a user are not visible immediately to other users that have the file open at the same time.";

            Answer[1] = "Once a file is closed, the changes made to it are visible only in sessions starting later.";
            Answer[2] = "Users are not allowed share the pointer of current location into the file.";

            Answer[0] = "Writes to an open file by a user are visible immediately to other users that have the file open at the same time.";

            rand();
            Question[i] = new quiz2("The UNIX file system uses which of the following consistency semantics?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "a root of the file system";
            Answer[1] = "a location of a shared file system";
            Answer[2] = "only appropriate for shared file systems";
            Answer[0] = "the location within the file structure where the file system is to be attached.";

            rand();
            Question[i] = new quiz2("A mount point is _____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "1, 3, 5, 4, 2";
            Answer[1] = "5, 1, 3, 2, 4";
            Answer[2] = "1, 5, 3, 4, 2";
            Answer[0] = "5, 1, 3, 4, 2";

            rand();
            Question[i] = new quiz2("Order the following file system layers in order of lowest level to highest level. [1] I/O control; [2] logical file system; [0] basic file system; [4] file-organization module; [5] devices;", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "can contain information needed by the system to boot an operating system from that partition";
            Answer[1] = "is a directory structure used to organize the files";
            Answer[2] = "contains many of the file's details, including file permissions, ownership, size, and location of the data blocks";
            Answer[0] = "contains information such as the number of blocks in a partition, size of the blocks, and free-block and FCB count and pointers";

            rand();
            Question[i] = new quiz2("A volume control block ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "linked allocation";
            Answer[1] = "indexed allocation";
            Answer[2] = "hashed allocation";
            Answer[0] = "contiguous allocation";

            rand();
            Question[i] = new quiz2("Which of the following allocation methods ensures that only one access is needed to get a disk block using direct access?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "transaction";
            Answer[1] = "backup";
            Answer[2] = "consistency checker";
            Answer[0] = "snapshot";

            rand();
            Question[i] = new quiz2("A _____ is a view of a file system before the last update took place.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "Clones are similar to snapshots.";

            Answer[1] = "WAFL is used exclusively on networked file servers";
            Answer[2] = "Part of caching uses non-volatile RAM (NVRAM.)";

            Answer[0] = "It provides little replication.";

            rand();
            Question[i] = new quiz2("Which of the following statements regarding the WAFL file system is incorrect?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[3] = "disk's rotation speed increases as the head moves towards the middle of the disk from either side";
            Answer[1] = "disk's rotation speed remains constant";
            Answer[2] = "density of bits decreases from the inner tracks to the outer tracks";
            Answer[0] = "density of bits per track is uniform";

            rand();
            Question[i] = new quiz2("On media that uses constant linear velocity, the ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "double cache";
            Answer[1] = "unified virtual memory";
            Answer[2] = "page cahce";
            Answer[0] = "unified buffer cache";

            rand();
            Question[i] = new quiz2("A __________ contains the same pages for memory-mapped IO as well as ordinary IO.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[3] = "does not usually provide an error-correcting code";
            Answer[1] = "is usually performed by the purchaser of the disk device";
            Answer[2] = "is different from physical formatting";
            Answer[0] = "divides a disk into sections that the disk controller can read and write";

            rand();
            Question[i] = new quiz2("Low-level formatting ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[3] = "0";
            Answer[1] = "0+1";
            Answer[2] = "4";
            Answer[0] = "5";

            rand();
            Question[i] = new quiz2("RAID level ____ is the most common parity RAID system.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[3] = "Swapping works in conjunction with virtual memory techniques.";

            Answer[1] = "Some systems allow for multiple swap spaces (disks).";
            Answer[2] = "Solaris only swaps pages of anonymous memory.";

            Answer[0] = "Typically, entire processes are swapped into memory.";

            rand();
            Question[i] = new quiz2("Which of the following statements is false?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "RAID levels 0 + 1 and 1 + 0";
            Answer[1] = "RAID level 3";
            Answer[2] = "RAID level 4";
            Answer[0] = "RAID level 5";

            rand();
            Question[i] = new quiz2("Which RAID level is best for storing large volumes of data?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "allow the most urgent work to be finished first";
            Answer[1] = "make it possible for high-priority interrupts to preempt the execution of a low priority interrupt";
            Answer[2] = "defer the handling of low-priority interrupt without masking off all interrupts";
            Answer[0] = "All of the above";

            rand();
            Question[i] = new quiz2("An interrupt priority scheme can be used to ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "access list";
            Answer[1] = "capability list";
            Answer[2] = "global table";
            Answer[0] = "lock-key";

            rand();
            Question[i] = new quiz2("Which of the following implementations of the access matrix is a compromise between two other implementations listed below?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "a key is defined when the capability is created";
            Answer[1] = "the capabilities point indirectly, not directly, to the objects";
            Answer[2] = "a list of pointers is maintained with each object that point to all capabilities associated with that object";
            Answer[0] = "capabilities are periodically deleted from each domain";

            rand();
            Question[i] = new quiz2("In the reacquisition scheme for implementing the revocation of capabilities, ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "Protection schemes are programmed as opposed to simply declared.";

            Answer[1] = "Protection requirements are dependant of the facilities provided by a particular operating system.";
            Answer[2] = "The means for enforcement needs to be provided by the designer of the subsystem.";

            Answer[0] = "Access privileges are closely related to the linguistic concept of a data type.";

            rand();
            Question[i] = new quiz2("Which of the following is an advantage of compiler-based enforcement of access control?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);

            i++;
            Answer[3] = "a backdoor";
            Answer[1] = "a trap door";
            Answer[2] = "a worm";
            Answer[0] = "a Trojan horse";

            rand();
            Question[i] = new quiz2("A code segment that misuses its environment is called ____.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[3] = "use the spawn mechanism to ravage system performance";
            Answer[1] = "can shut down an entire network";
            Answer[2] = "continue to grow as the Internet expands";
            Answer[0] = "All of the above";
            Question[i] = new quiz2("Worms", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
i++;
            Answer[0] = "False";
            Answer[1] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("virtual memory decreases the degree of multiprogramming in a system. ", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
             Answer[1] = "False";
            Answer[0] = "True";
            Answer[2] = "Empty";
            Answer[3] = "Empty";
            rand();
            Question[i] = new quiz2("On a system with demand-paging, a process will experience a high page fault rate when the process begins execution.", Answer[1], Answer[0], Answer[2], Answer[3], Answer[0], Answer[0]);
            i++;
            Answer[0] = "contiguous allocation";
            Answer[1] = "linked allocation";
            Answer[2] = "indexed allocation";
            Answer[3] = "hashed allocation";

            rand();
            Question[i] = new quiz2("Indexed allocation…..", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "each file must occupy a set of contiguous blocks on the disk";
            Answer[1] = "each file is a linked list of disk blocks";
            Answer[2] = "all the pointers to scattered blocks are placed together in one location";
            Answer[3] = "none of the mentioned";

            rand();
            Question[i] = new quiz2("In linked allocations….", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "disk address of the first block & length";
            Answer[1] = "length & size of the block";
            Answer[2] = "size of the block";
            Answer[3] = "total size of the file";

            rand();
            Question[i] = new quiz2("Contiguous allocation of a file is defined by…..", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "each file is a linked list of disk blocks";
            Answer[1] = "each file must occupy a set of contiguous blocks on the disk";
            Answer[2] = "all the pointers to scattered blocks are placed together in one location";
            Answer[3] = "none of the mentioned";

            rand();
            Question[i] = new quiz2("In contiguous allocation…..", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "compaction";
            Answer[1] = "check";
            Answer[2] = "formatting";
            Answer[3] = "replacing memory";

            rand();
            Question[i] = new quiz2("Which  of the following suffers from external fragmentation?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "all the pointers to scattered blocks are placed together in one location";
            Answer[1] = "each file must occupy a set of contiguous blocks on the disk";
            Answer[2] = "each file is a linked list of disk blocks";
            Answer[3] = "none of the mentioned";

            rand();
            Question[i] = new quiz2("Which of the following allocation methods ensures that only one access is needed to get a disk block using direct access", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Naming";
            Answer[1] = "Multilevel mapping";
            Answer[2] = "Transparent";
            Answer[3] = "Migration";

            rand();
            Question[i] = new quiz2("In distributed file system, ___ is mapping between logical and physical objects.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
               Answer[0] = "Location transparency";
            Answer[1] = "Location independence                     ";
            Answer[2] = "Protection";
            Answer[3] = "File migration";
            

            rand();
            Question[i] = new quiz2("The name of the file does not reveal any hint of the file’s physical storage location is called___.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Service";
            Answer[1] = "Server";
            Answer[2] = "Clint";
            Answer[3] = "None of the above.";

            rand();
            Question[i] = new quiz2("____   software entity running on one or more machines and providing a particular type of function to a priori unknown clients ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
         
Answer[0] = "Paravirtualization";
            Answer[1] = "Programming-environment virtualization.";
            Answer[2] = "Emulators.";
            Answer[3] = "Application containment.";
            rand();
            Question[i] = new quiz2("_____ Technique in which the guest operating system is modified to work in cooperation with the VMM to optimize performance. ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Type 0 hypervisors.";
            Answer[1] = "Type 2 hypervisors";
            Answer[2] = "Type 1 hypervisors";
            Answer[3] = "Type 3 hypervisors";

            rand();
            Question[i] = new quiz2("IBM LPARs and ORACLE LDOMs are examples for ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Metadata";
            Answer[1] = "Logical file system";
            Answer[2] = "Basic file system";
            Answer[3] = "File-organization module";

            rand();
            Question[i] = new quiz2("includes all of the file system structure, minus the actual contents of files. ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "inode";
            Answer[1] = "file";
            Answer[2] = "superblock";
            Answer[3] = "dentry";

            rand();
            Question[i] = new quiz2("In the Linux VFS architecture, a(n) __ object represents an individual file. ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = " sequential access";
            Answer[1] = "logical access";
            Answer[2] = "relative access";
            Answer[3] = "direct access";

            rand();
            Question[i] = new quiz2("The simplest file access method is __.", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "independent machines with independent file systems";
            Answer[1] = "dependent machines with independent file systems";
            Answer[2] = "dependent machines with dependent file systems";
            Answer[3] = "independent machines with dependent file systems";

            rand();
            Question[i] = new quiz2("NFS views a set of interconnected workstations as a set of __. ", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "contiguous allocation.";
            Answer[1] = "hashed allocation.";
            Answer[2] = "index allocation.";
            Answer[3] = "linked allocation.";

            rand();
            Question[i] = new quiz2("Which of the following allocation method ensure that the only one access is needed to get a disk block using direct access:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "file structure.";
            Answer[1] = "file system.";
            Answer[2] = "file control clock.";
            Answer[3] = "device driver.";

            rand();
            Question[i] = new quiz2("Collection of related informations:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Malware.";
            Answer[1] = "Ransomware.";
            Answer[2] = "firewall";
            Answer[3] = "Spyware.";

            rand();
            Question[i] = new quiz2("Software desinged to explore, disabled, damage computer", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "contiguous allocation.";
            Answer[1] = "hashed allocation.";
            Answer[2] = "index allocation.";
            Answer[3] = "linked allocation.";

            rand();
            Question[i] = new quiz2("allocation method  suffers from external fragmentation:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Disteibuted file system.";
            Answer[1] = "service.";
            Answer[2] = "server.";
            Answer[3] = "client.";

            rand();
            Question[i] = new quiz2("File system whos clients,servers,storage are distributed among machines:", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Locks";
            Answer[1] = "Domain";
            Answer[2] = "Keys";
            Answer[3] = "Copy";

            rand();
            Question[i] = new quiz2("in Access matrix- implementation option( 4 ) , Each object has list of unique bit patterns, called ?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Domain";
            Answer[1] = "Locks";
            Answer[2] = "Keys";
            Answer[3] = "Object";

            rand();
            Question[i] = new quiz2("In Access matrix- implementation option( 4 ) , Each domain as list of unique bit patterns, called ?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Type 0 hypervisor";
            Answer[1] = "Type 1 hypervisor";
            Answer[2] = "Type 2 hypervisor";
            Answer[3] = "Emulators";

            rand();
            Question[i] = new quiz2("Can provide virtualization-within-virtualization (guest itself can be a VMM with guests?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Type of Vms-Paravirtualization";
            Answer[1] = "Type 1 hypervisor";
            Answer[2] = "Type 2 hypervisor";
            Answer[3] = "Emulators";

            rand();
            Question[i] = new quiz2("Guest uses hypercall (call to hypervisor) when page-table changes needed", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Type of Vms-Paravirtualization";
            Answer[1] = "Type 1 hypervisor";
            Answer[2] = "Type 2 hypervisor";
            Answer[3] = "Emulators";

            rand();
            Question[i] = new quiz2("Memory management does not include nested page tables?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "First-fit";
            Answer[1] = "Best-fit";
            Answer[2] = "Worst-fit";
            Answer[3] = "First-fit,Best-fit";
            rand();
            Question[i] = new quiz2("Allocate the first hole that is big enough,called?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Virtual memory";
            Answer[1] = "Virtual address space";
            Answer[2] = "Demand paging";
            Answer[3] = "Basic concept";

            rand();
            Question[i] = new quiz2("separation of user logical memory from physical,called?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Global replacement";
            Answer[1] = "Local replacement";
            Answer[2] = "Thrashing";
            Answer[3] = "Locality model";
            rand();
            Question[i] = new quiz2("process selects a replacement frame from the set of all frames,one process can take a frame from another,called?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Snapshot";
            Answer[1] = "Checksums";
            Answer[2] = "Pools";
            Answer[3] = "Logical block";
            rand();
            Question[i] = new quiz2("is a view of file system before a set of changes take place , called?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Caching";
            Answer[1] = "Spooling";
            Answer[2] = "Device reservation";
            Answer[3] = "Buffering";
            rand();
            Question[i] = new quiz2("WHAT IS THE DOMAIN", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "SET OF ACCESS-RIGHTS";
            Answer[1] = "A COLLECTION OF PROTECTION POLICIES";
            Answer[2] = "SET OF ALL OBJECTS";
            Answer[3] = "NONE OF THE MENTIONED";
            rand();
            Question[i] = new quiz2("faster device holding copy of data ,called?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "USER";
            Answer[1] = "PROCESS";
            Answer[2] = "PROCEDURE";
            Answer[3] = "TASK";
            rand();
            Question[i] = new quiz2("IN THE OPEATING SYSTEM , A DOMAIN IS ASSOCIATED WITH THE ALL OF THE MENTIONED", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "LEAST  PRIVILEGE PRINCIPLE";
            Answer[1] = "NEED-TO-KNOW  PRINCIPLE";
            Answer[2] = "DYNAMIC PROTECTION PRINCIPLE";
            Answer[3] = "ACCESS-LISTS PRINCIPLE";
            rand();
            Question[i] = new quiz2("PRINCIPLE DICTATES THAT PROGRAMS AND USERS BE GIVEN JUST ENOUGH PRIVILEGES TO PERFORM THEIR TASKS", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "ACCESS-RIGHT=<OBJECT-NAME,RIGHTS-SET>";
            Answer[1] = "ACCESS-RIGHT=<READ-NAME,WRITE-SET>";
            Answer[2] = "ACCESS-RIGHT=<OBJECT-NAME,EXECUTE-SET>";
            Answer[3] = "ACCESS-RIGHT=<READ-NAME,EXECUTE-SET>";
            rand();
            Question[i] = new quiz2("IN DOMAIN STRUCTURE ACCESS-RIGHT EQUAL TO", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "ROWS-DOMAINS , COLUMNS-OBJECTS";
            Answer[1] = "ROWS-OBJECTS , COLUMNS-DOMAINS";
            Answer[2] = "ROWS-ACCESS LIST , COLUMNS-DOMAINS";
            Answer[3] = "ROWS-DOMAINS , COLUMNA-ACCESS LIST";

            rand();
            Question[i] = new quiz2("WHAT DOES ACCESS MATRIX REPRESENT", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "SEBSET OF ALL VALID OPERATIONS THAT CAN BE PERFORMED ON THE OBJECT";
            Answer[1] = "SUBSET CONSIST OF READ AND WRITE";
            Answer[2] = "SUBSET CONSIST OF READ , WRITE AND EXECUTE";
            Answer[3] = "NONE OF THE MENTIONED";

            rand();
            Question[i] = new quiz2("WHAT IS MEANING OF RIGHT-SET", Answer[1], Answer[2], Answer[0], Answer[3], Answer[0], Answer[0]);
            i++;
            Answer[0] = "OWNER";
            Answer[1] = "COPY";
            Answer[2] = "TRANSFER";
            Answer[3] = "LIMITED COPY";
            rand();
            Question[i] = new quiz2("WHO CAN ADD NEW RIGHTS AND REMOVE SOME RIGHTS", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "LOCK-KEY";
            Answer[1] = "GLOBAL TABLE";
            Answer[2] = "ACCESS LISTS FOR OBJECTS";
            Answer[3] = "CAPABILITY LIST FOR DOMAINS";
            rand();
            Question[i] = new quiz2("COMPROMISE BETWEEN ACCESS LISTS AND CAPABILITY LISTS", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "GLOBAL TABLE";
            Answer[1] = "LOCK-KEY";
            Answer[2] = "ACCESS LISTS FOR OBJECTS";
            Answer[3] = "CAPABILITY LIST FOR DOMAINS";

            rand();
            Question[i] = new quiz2("STORE ORDERED TRIPLES <DOMAIN , OBJECT , RIGHTS-SET>", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "ACCESS LISTS FOR OBJECTS";
            Answer[1] = "GLOBAL TABLE";
            Answer[2] = "LOCK-KEY";
            Answer[3] = "CAPABILITY LIST FOR DOMAINS";

            rand();
            Question[i] = new quiz2("EACH COLUMN IMPLEMENTED AS AN ACCESS LIST FOR ONE OBJECT", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            
            Answer[0] = "CAPABILITY LIST FOR DOMAINS";
            Answer[1] = "ACCESS LISTS FOR OBJECTS";
            Answer[2] = "GLOBAL TABLE";
            Answer[3] = "LOCK-KEY";
            rand();
            Question[i] = new quiz2("LIST OF OBJECTS TOGETHER WITH OPERATIONS ALLOWS ON THEM", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "6 different levels.";
            Answer[1] = "5 different levels.";
            Answer[2] = "8 different levels.";
            Answer[3] = "4 different levels.";
            rand();
            Question[i] = new quiz2("RAID Structure arranged into?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Equal allocation";
            Answer[1] = "Proportional Allocation";
            Answer[2] = "Global Replacement";
            Answer[3] = "Local Replacement";

            rand();
            Question[i] = new quiz2("divide the total number of frames to each process equally it is a ?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Keyboard,";
            Answer[1] = "Disk drives.";
            Answer[2] = "Networks sockets";
            Answer[3] = "Memory-mapped file access";

            rand();
            Question[i] = new quiz2("Character Devices it is ?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Buffering";
            Answer[1] = "fairness";
            Answer[2] = "Caching";
            Answer[3] = "Spooling";

            rand();
            Question[i] = new quiz2("Store data in memory while transferring between devices it is a ?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Replay Attack";
            Answer[1] = "Session hijacking";
            Answer[2] = "Privilege escalation";
            Answer[3] = "Masquerading";

            rand();
            Question[i] = new quiz2("Replaying the same message or adding a modification to it it is a ?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "mount table";
            Answer[1] = "system wide open file table ";
            Answer[2] = "per-process open file table";
            Answer[3] = "file system";

            rand();
            Question[i] = new quiz2("storing file system mounts, mount points, file system types?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "file organization module";
            Answer[1] = "basic file system";
            Answer[2] = "device drivers";
            Answer[3] = "file system";

            rand();
            Question[i] = new quiz2("understands files, logical address, and physical blocks?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "file control block";
            Answer[1] = "driver control block";
            Answer[2] = "device driver";
            Answer[3] = "file system";

            rand();
            Question[i] = new quiz2("storage structure consisting of information about file?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "thrashing";
            Answer[1] = "global replacement";
            Answer[2] = "local replacement";
            Answer[3] = "locality model";

            rand();
            Question[i] = new quiz2("process busy swapping pages in and out?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "virtual address space";
            Answer[1] = "virtual memory";
            Answer[2] = "memory resident";
            Answer[3] = "over- allocation";

            rand();
            Question[i] = new quiz2(" logical view of how process is stored in memory?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "distributed";
            Answer[1] = "Node";
            Answer[2] = "Service";
            Answer[3] = "Site";

            rand();
            Question[i] = new quiz2("A - - - - system is a collection of loosely coupled nodes interconnected by a communications network=", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "peer to peer";
            Answer[1] = "Many to many";
            Answer[2] = "Clint service";
            Answer[3] = "One to one";
            rand();
            Question[i] = new quiz2("In - - - - configuration, each node shares equal responsibilities and can act as both clients and servers=", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "message passing";
            Answer[1] = "Message";
            Answer[2] = "Load balancing";
            Answer[3] = "Service system";
            rand();
            Question[i] = new quiz2(" Communication over a network occurs through - - -=", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Location transparency";
            Answer[1] = "Location independence";
            Answer[2] = "Naming";
            Answer[3] = "Transparent";
            rand();
            Question[i] = new quiz2(" - - - file name does not reveal the file's physical storage location=", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Resource sharing, Computation speedup, Reliability";
            Answer[1] = "Resource sharing, Computation speedup, Scalability";
            Answer[2] = "Resource sharing, Transparency, Reliability";
            Answer[3] = "Robustness, Computation speedup, Reliability";

            rand();
            Question[i] = new quiz2("WHAT ARE THE REASONS FOR DISTRIBUTED SYSTEMS?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "moving jobs to more lightly-laoded sites.";
            Answer[1] = "detect and recover failurs";
            Answer[2] = "system should appear as a conventional system ";
            Answer[3] = "Sharing files, information, printing.";

            rand();
            Question[i] = new quiz2("What is Load balancing mean?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Location transparency";
            Answer[1] = "Location independence";
            Answer[2] = "Remote-service mechanics";
            Answer[3] = "Online location";

            rand();
            Question[i] = new quiz2("file name does not reveal file physical location is definition of ?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "Ensure that each object is accessed correctly by the processes that are allowed to do so.";
            Answer[1] = "is as weak as the weakest link in the chain";
            Answer[2] = "grab passwords, credit card numbers";
            Answer[3] = "software designed to exploit, disable, damage computer";

            rand();
            Question[i] = new quiz2("What is true about Protection?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            i++;
            Answer[0] = "contains copy of the FCB of each file";
            Answer[1] = "stores file system mounts, file system types";
            Answer[2] = "contains pointers to appropiate enteries in system-wide open-table";
            Answer[3] = "two files hash to the same function.";
            rand();
            Question[i] = new quiz2("What is true about System-wide open-file table?", Answer[a], Answer[b], Answer[c], Answer[d], Answer[0], Answer[0]);
            System.out.println(i);
            
            
            
            
            while (Counter != 35 && seconds > time) {
                 Random rand = new Random();

                int ran = rand.nextInt(350) %286;
                questions quiz = new questions(Question[ran], window);
                quiz.getAnswer(time);
                x = quiz.getTime().M;
                seconds = quiz.getTime().S;
                score = quiz.getScore();
                if (Counter == Question.length - 1 || (seconds == time)) {
                   
                }
                Counter++;
            }

            int CounterQ = 35;
            scorePane scorePane = new scorePane(window, score, CounterQ);
            scorePane.choose();

        }
    }

}
