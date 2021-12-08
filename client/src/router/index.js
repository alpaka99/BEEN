import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Signup from '@/views/User/Signup.vue'
import Login from '@/views/User/Login.vue'
import Feed from '@/views/Feed/Feed.vue'
import FeedWrite from '@/views/Feed/FeedWrite.vue'
import Search from '@/views/Search/Search.vue'
import Profile from '@/views/User/Profile.vue'
import NotFound from '@/components/NotFound/NotFound.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },

  {
    path: '/login',
    name: 'Login',
    component: Login,
  },
  {
    path: '/signup',
    name: 'Signup',
    component: Signup,
    children:[
      {
        path: "",
        name: "SignupUserInfo",
        component: () => import("@/components/User/SignupUserInfo.vue")
      },
      {
        path: "favorite",
        name: "SignupUserFavorite",
        component: () => import("@/components/User/SignupUserFavorite.vue"),
        props: true
      },
      {
        path: "success",
        name: "SignupSuccess",
        component: () => import("@/components/User/SignupSuccess.vue")
      }
    ]
  },
  
  {
    path: "/feed",
    name: "Feed",
    component: Feed,
    children:[
      {
        path:"",
        name:"Feed",
        component: ()=> import("@/components/Feed/FeedList.vue")
      },
      {
        path:"/favorite",
        name:"FavoriteList",
        component: ()=> import("@/components/Feed/FavoriteList.vue")
      },
      {
        path:"/:feedNumber",
        name:"FeedDetail",
        component: ()=> import("@/components/Feed/FeedDetail.vue")
      },
    ],
    redirect: () => {
      return "/feed";
    }
  },
  
  {
    path: "/search",
    name: "Search",
    component: Search,
    children:[
      {
        path:"/typesearch",
        name: "TypeSearch",
        component: ()=> import("@/components/Search/TypeSearch.vue")
      },
      {
        path:"/peoplesearch",
        name: "PeopleSearch",
        component: ()=> import("@/components/Search/PeopleSearch.vue")
      },
    ],
  },
  
  {
    path: "/profile",
    name: "Profile",
    component: Profile,
    children: [
      {
        path:"/:userId",
        name:"UserProfile",
        component: ()=> import("@/components/User/UserProfile.vue")
      },
    ],
  },

  {
      path: '/:pathMatch(.*)*',
      // redirect: "/404",
      component : NotFound
  },
  // FeedWrite_csy
  {
    path: '/write',
    name: 'Write',
    component: FeedWrite,
    children: [
      {
        path: "",
        name: "FeedWrite1",
        component: ()=> import("@/components/Feed/FeedWrite1.vue")
      },
      {
        path: "/2",
        name: "FeedWrite2",
        component: ()=> import("@/components/Feed/FeedWrite2.vue")
      },
      {
        path: "/3",
        name: "FeedWrite3",
        component: ()=> import("@/components/Feed/FeedWrite3.vue")
      },
    ],
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
