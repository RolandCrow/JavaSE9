package oop;

import java.util.ArrayList;

public class Network {

    public class Member { // внутренний класс
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>();
        }

        public void deactivate() {
            members.remove(this);
        }
    }

    public Member enroll(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }
    private ArrayList<Member> members = new ArrayList<>();

}
