class student {
        String name;
        int age;

        public void info(){
            System.out.println(this.name);
            System.out.println(this.age);
        }

        student(){
            System.out.println("constructor called");
        }
    }