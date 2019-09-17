/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import lab_8.entities.Comment;
import lab_8.entities.Post;
import lab_8.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    private Map<Integer, Comment> comments = DataStore.getInstance().getComments();
    private Map<Integer,Post> posts = DataStore.getInstance().getPosts();
    private Map<Integer, User> users = DataStore.getInstance().getUsers();
    private HashMap<Integer, Integer> userLikecount = new HashMap<Integer, Integer>();
 
    
    public void userWithMostLikes(){
        
        
    }
    
    public void getFiveMostLikedComment(){
        
        
    }
    
     public void getAverageNumberOfLikesPerComment() {
        System.out.println("-------------Average Number Of Likes Per Comment----------------------------");
        List<Comment> commentList = new ArrayList<>(comments.values());
        int sum = 0;
        for(Comment c :commentList){
            sum = c.getLikes() + sum;
        }
        //System.out.println(sum);
        double avg = Math.ceil(sum/commentList.size());
        System.out.println(avg);
    }
     
     
     public void getPostWithMostLikedComments(){
    System.out.println("-------------Post with most liked comments----------------------------");
    List<Post> postList = new ArrayList<>(posts.values());
        Collections.sort(postList, new Comparator<Post>() {
            @Override
            public int compare(Post p1,Post p2){
                int numLikesp1 = 0;
                int numLikesP2 = 0;
                for(Comment c:p1.getComments()){
                    numLikesp1 = c.getLikes()+numLikesp1;
                }
                for(Comment c:p2.getComments()){
                    numLikesP2 = c.getLikes()+numLikesP2;
                }
                return numLikesP2-numLikesp1;
            }
        });
        System.out.println(postList.get(0).getPostId());
    }
    public void postWithMostComments(){
       Map<Integer,Integer> mostComment = new HashMap<Integer,Integer>();
       Map<Integer,Comment>  com = DataStore.getInstance().getComments();
       
       List<Comment>commentList = new ArrayList<>(com.values());
        for(Comment i: commentList)
     {
         int count = 0;
      if(mostComment.containsKey(i.getPostId()))
          //likes = userLikecount.get(user.getId());
          count=mostComment.get(i.getPostId());
      count= count +1;
      mostComment.put(i.getPostId(),count);
    }
        //System.out.println("cont is"+ mostComment);
      int maxCom = 0;
     int maxIdCom=0;
     for(int id : mostComment.keySet()){
     if(mostComment.get(id)>maxCom){
         maxCom = mostComment.get(id);
         maxIdCom = id;
     }
     }
       System.out.println("\nPost with most Comments:\nPost id is "+maxIdCom+"\nnumber of comments is "+maxCom);  
}
     public void topFiveinactiveUserCommnets(){
       Map<Integer,Integer> mostpost = new HashMap<Integer,Integer>();
       Map<Integer,Comment>  pos = DataStore.getInstance().getComments();
       
       List<Comment>postList = new ArrayList<>(pos.values());
       
        for(Comment i: postList)
     {
         int count = 0;
      if(mostpost.containsKey(i.getUserId()))
          //likes = userLikecount.get(user.getId());
          count=mostpost.get(i.getUserId());
      count= count +1;
      mostpost.put(i.getUserId(),count);
       
    }
       // System.out.println("cont is"+ mostpost);
        
      Set<Map.Entry<Integer, Integer>> set = mostpost.entrySet();
    List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
    {
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
            return(o1.getValue()).compareTo(o2.getValue());
        }
    }

            );

    System.out.println("\nTop 5 most Inactive users based on comments : ");
      for ( int i = 0 ; i < list.size() && i < 5 ; i ++)
      {
       System.out.println(list.get(i));
      }
 
}
       public void topFiveProactiveUsers(){
     Map<Integer,Integer> mostpost = new HashMap<Integer,Integer>();
     
       Map<Integer,Post>  pos = DataStore.getInstance().getPosts();
       
       List<Post>postList = new ArrayList<>(pos.values());
       
        for(Post i: postList)
     {
         int count = 0;
      if(mostpost.containsKey(i.getUserId()))
          //likes = userLikecount.get(user.getId());
          count=mostpost.get(i.getUserId());
      count= count +1;
      mostpost.put(i.getUserId(),count);   
    }
           //System.out.println("post list is "+mostpost );          
           Map<Integer,Integer> mostCom = new HashMap<Integer,Integer>();
       Map<Integer,Comment>  comm = DataStore.getInstance().getComments();      
       List<Comment>comList = new ArrayList<>(comm.values());
       
        for(Comment j: comList)
     {
         int count1 = 0;
      if(mostCom.containsKey(j.getUserId()))
          //likes = userLikecount.get(user.getId());
          count1=mostCom.get(j.getUserId());
      count1= count1 +1;
      mostCom.put(j.getUserId(),count1);
       
    }       
       // System.out.println("comm list is "+mostCom );
        
        
         Map<Integer,Integer> mostsum = new HashMap<Integer,Integer>();
         for(int id : mostCom.keySet())
        {
            
            int sum=0;
            if(mostpost.containsKey(id))
            {
                sum=mostCom.get(id) + mostpost.get(id);
            }
            else
            {
                sum=mostCom.get(id);
            }
            if(!mostsum.containsKey(id))
            {
                mostsum.put(id,sum);
            }                                                  
        }
          // System.out.println("final is "+ mostsum);
           
            Set<Map.Entry<Integer, Integer>> set = mostsum.entrySet();
    List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
    {
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
            return(o1.getValue()).compareTo(o2.getValue());
        }
    }
            );

    System.out.println("\nTop 5 most Proactive users based on comments,Posts : ");
      for ( int i = 0 ; i < list.size() && i < 5 ; i ++)
      {
       System.out.println(list.get(i));
      }
       }
       
        public void getfiveinactiveusers(){
     Map<Integer,Integer> List1 = new HashMap<Integer,Integer>();
     Map<Integer,Integer> List2 = new HashMap<Integer,Integer>();
     Map<Integer,Integer> List= new HashMap<Integer,Integer>();
      Map<Integer,Post> posts = DataStore.getDataStore().getPosts();
     for( Post p : posts.values()){
         int noofPosts = 0;
         if(List1.containsKey(p.getUserId()))
             noofPosts = List1.get(p.getUserId());
         noofPosts+=1;
         List1.put(p.getUserId(),noofPosts);
         for(Comment c : p.getComments()){
             int noofComments = 0;               
             if(List2.containsKey(p.getUserId()))
                 noofComments = List2.get(p.getUserId());
             noofComments+=1;
             List2.put(p.getUserId(), noofComments); 
         }
     }        
     for(Post p1 :posts.values()){
         if(List1.containsKey(p1.getUserId()) && List2.containsKey(p1.getUserId())){
             if(!List.containsKey(p1.getUserId())){
                 int combine = List2.get(p1.getUserId())+ List1.get(p1.getUserId());
            List.put(p1.getUserId(), combine);
         } 
     }
     }
     List<Entry> inactiveusers = new ArrayList<Entry>(List.entrySet());
     Collections.sort(inactiveusers, new Comparator<Entry>(){

             @Override
             public int compare(Entry t, Entry t1) {
                 String value1 = t.getValue().toString();
                 String value2 = t1.getValue().toString();
                 return value1.compareTo(value2);
             }
         
     });
     System.out.println("\n");
     System.out.println("Five Most inactive Users based on Posts,Comments and Likes");
     System.out.println("UserId=No of Posts+No of Comments");
     for(int i=0;i<5;i++){   
         System.out.println(inactiveusers.get(i));
     }
 }
        
           public void inactiveuserposts(){
       Map<Integer,Integer> userPostcount = new HashMap<Integer,Integer>();
       
//       Map<Integer,User> user1 =DataStore.getDataStore().getUsers();
       Map<Integer,Post> posts = DataStore.getDataStore().getPosts();
               for(Post p : posts.values()){
                   int post =0;
                   if(userPostcount.containsKey(p.getUserId()))
                       post =userPostcount.get(p.getUserId());
                   post+=1;
                   userPostcount.put(p.getUserId(), post);
                   }
//               for(User u :user1.values()){
//                       if(!userPostcount.containsKey(u.getId())){
//                         userPostcount.put(u.getId(),0);
//                       }
//                }
               List<Entry> entryList = new ArrayList<Entry>(userPostcount.entrySet());
//                    List<Integer> Post1 = new ArrayList<>(userPostcount.values());  
              Collections.sort(entryList, new Comparator<Entry>(){

           @Override
           public int compare(Entry t, Entry t1) {
               String value1 = t.getValue().toString();
               String  value2 = t1.getValue().toString();
               return value1.compareTo(value2);
           }
                  
              }
               );
              System.out.println("\n");
              System.out.println(" Five inactive Users based on Posts");
              System.out.println("Userid=No of Posts");
               for(int i =0;i<5;i++){
                              System.out.println(entryList.get(i));
                           }
           }
}
