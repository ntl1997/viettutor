import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

// layouts

import Admin from '@/layouts/Admin.vue'
import Auth from '@/layouts/Auth.vue'

// views for Admin layout

import Dashboard from '@/views/admin/Dashboard.vue'
import Settings from '@/views/admin/Settings.vue'
import Tables from '@/views/admin/Tables.vue'
import Maps from '@/views/admin/Maps.vue'

// views for Auth layout

import Login from '@/views/auth/Login.vue'
import Register from '@/views/auth/Register.vue'

// views without layouts

import Landing from '@/views/Landing.vue'
import Profile from '@/views/Profile.vue'
import Index from '@/views/Index.vue'
import TutorRequestForm from '@/views/TutorRequestForm.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    // {
    //   path: '/',
    //   name: 'home',
    //   component: HomeView,
    // },
    // {
    //   path: '/about',
    //   name: 'about',
    //   // route level code-splitting
    //   // this generates a separate chunk (About.[hash].js) for this route
    //   // which is lazy-loaded when the route is visited.
    //   component: () => import('../views/AboutView.vue'),
    // },
    {
      path: '/admin',
      redirect: '/admin/dashboard',
      component: Admin,
      children: [
        {
          path: '/admin/dashboard',
          component: Dashboard,
        },
        {
          path: '/admin/settings',
          component: Settings,
        },
        {
          path: '/admin/tables',
          component: Tables,
        },
        {
          path: '/admin/maps',
          component: Maps,
        },
      ],
    },
    {
      path: '/auth',
      redirect: '/auth/login',
      component: Auth,
      children: [
        {
          path: '/auth/login',
          component: Login,
        },
        {
          path: '/auth/register',
          component: Register,
        },
      ],
    },
    {
      path: '/landing',
      component: Landing,
    },
    {
      path: '/profile',
      component: Profile,
    },
    {
      path: '/',
      component: Index,
    },
    { path: '/:pathMatch(.*)*', redirect: '/' },

    {
      path: '/tutor-request',
      name: 'TutorRequest',
      component: TutorRequestForm,
    }
  ],
})

export default router
